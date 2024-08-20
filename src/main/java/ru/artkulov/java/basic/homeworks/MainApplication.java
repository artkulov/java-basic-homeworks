package ru.artkulov.java.basic.homeworks;


public class MainApplication {
    // Тестовый массив с неверным размером
    private static String[][] str1 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    // тестовый массив с неконвертируемым значением
    private static String[][] str2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Десять", "11", "12"}, {"13", "14", "15", "16"}};
    // тестовый массив правильный
    private static String[][] str3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

    public static void main(String[] args) {
        try {
            System.out.println("Сумма элеметов массива = " + methodEx(str2));
        } catch (AppArrayDataException | AppArraySizeException e) {
            System.out.println(e);
            System.out.println("Невозможно получить результат расчета суммы");
        }

    }

    public static int methodEx(String[][] arr) throws RuntimeException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new AppArraySizeException("Массив не соответствует размерности 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("В переданном массиве элемент Array[" + i + "][" + j + "] не может быть конвертирован в число");
                }
            }
        }
        return sum;

    }
}
