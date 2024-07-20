package ru.artkulov.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 9, 8, 6};
        sumArrays(new int[]{1, 2, 6, 7}, new int[]{5, 6, 8, 9, 2, 3, 6,}, new int[]{1, 6, 8, 0, 4});
    }

    public static void writeString(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5)
                sum += array[i];
        }
        System.out.println("Сумма элементов массива, значение которых больше 5 = " + sum);
    }

    public static void fillArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
        }
    }

    public static void increaseTheNumber(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void whichHalfBigger(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sumLeft += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sumRight += array[i];
        }
        if (sumLeft > sumRight)
            System.out.println("Сумма элементов левой половины массива больше " + sumLeft + " > " + sumRight);
        else if (sumRight > sumLeft)
            System.out.println("Сумма элементов правой половины массива больше " + sumRight + " > " + sumLeft);
        else
            System.out.println("Суммы элементов левой и правой половины равны " + sumRight + " = " + sumLeft);
    }

    // Задания под звездочкой

    public static void sumArrays(int[]... arrays) {
        int[] sum = new int[];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {


            }


        }
    }


}
