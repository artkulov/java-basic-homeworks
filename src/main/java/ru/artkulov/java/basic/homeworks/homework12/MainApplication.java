package ru.artkulov.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {
    static String filePath;

    public static void main(String[] args) throws FileNotFoundException, InputMismatchException, IllegalStateException {
        String path = "C:\\Users\\Artem\\IdeaProjects\\java-basic-homeworks";
        // Запрашиваем все .txt файлы
        getAllFiles(path);

        // Выводим запрос на имя файла, с которым будем работать:
        System.out.println("Пожалуйста введите имя файла и нажмите Enter:");
        Scanner scannerName = new Scanner(System.in);
        String fileName = scannerName.nextLine();

        // Читаем выбранный файл
        readFromFile(getFilePath(path, fileName));
        System.out.println();
        System.out.println();

        // Определяем фразу, которую добавляем в файл:
        System.out.println("Пожалуйста введите фразу, которую запишете в файл, и нажмите Enter:");
        Scanner phrase = new Scanner(System.in);
        String enter = "\n" + phrase.nextLine();
        System.out.println(enter);
        System.out.println();

        // Пишем в файл:
        writeInFile(enter, getFilePath(path, fileName));

        // Повторно читаем файл:
        readFromFile(getFilePath(path, fileName));
    }

    /**
     * Метод предназначеный для вывода всех файлов с расширением .txt в указанной папке и подпапках
     *
     * @param path Путь к папке, в которой необходимо найти все .txt файлы
     */
    private static void getAllFiles(String path) {
        File currDir = new File(path);
        File[] filesList = currDir.listFiles();
        for (File f : filesList) {
            if (f.isDirectory()) getAllFiles(f.getAbsolutePath());
            if (f.isFile() && f.getName().lastIndexOf("txt") > 0) {
                System.out.println(f.getName());
            }
        }
    }

    /**
     * Метод возвращающий абсолютный путь выбранного файла
     *
     * @param path     Путь к корневой папке
     * @param fileName Имя выбранного файла
     * @return Абсолютный путь выбранного файла
     */
    private static String getFilePath(String path, String fileName) {
        File currDir = new File(path);
        File[] filesList = currDir.listFiles();
        for (File f : filesList) {
            if (f.isDirectory()) getFilePath(f.getAbsolutePath(), fileName);
            if (f.isFile() && f.getName().equals(fileName)) {
                filePath = f.getAbsolutePath();
                break;
            }
        }
        return filePath;
    }

    /**
     * Метод предназначеный для чтения из указанного файла
     *
     * @param file Файл, который необходимо прочитать
     * @throws FileNotFoundException
     */
    public static void readFromFile(String file) throws FileNotFoundException {
        InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
        try (in) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Метод предназначенный для записи текста в выбранный файл
     *
     * @param enter Текст для записи
     * @param file  Файл, в который необходимо записать текст
     * @throws FileNotFoundException
     */
    public static void writeInFile(String enter, String file) throws FileNotFoundException {
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true));
        try (out) {
            byte[] buffer = enter.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            out.flush();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
