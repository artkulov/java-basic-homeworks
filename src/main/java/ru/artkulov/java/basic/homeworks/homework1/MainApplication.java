package ru.artkulov.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 для вызова соответствующего метода:\n1. greetings\n2. checkSign\n3. selectColor\n4. compareNumbers\n5. addOrSubtractAndPrint\n");
        int number;
        do {
            number = sc.nextInt();
        }
        while (number < 1 || number > 5);

        if (number == 1) {
            greetings();
        } else if (number == 2) {
            checkSign((int) ((Math.random() * 200) - 100), (int) ((Math.random() * 200) - 100), (int) ((Math.random() * 200) - 100));
        } else if (number == 3) {
            selectColor();
        } else if (number == 4) {
            compareNumbers();
        } else {
            addOrSubtractAndPrint((int) ((Math.random() * 200) - 100), (int) ((Math.random() * 200) - 100), false);
        }

    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int summ = a + b + c;
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 21;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
