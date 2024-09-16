package ru.artkulov.java.basic.homeworks.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in);
        ) {
            String operations = in.readLine();
            System.out.println(operations);

            System.out.println("Введите два числа и операцию (например, 3 6 -): ");
            String userprint = scanner.nextLine();
            out.println(userprint);

            String result = in.readLine();
            System.out.println(result);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка при подключении к серверу: " + e.getMessage());
        }
    }
}
