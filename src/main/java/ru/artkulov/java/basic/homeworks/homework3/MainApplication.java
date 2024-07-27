package ru.artkulov.java.basic.homeworks.homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {

    }

    /**
     * Метод, вычисляющий сумму элементов двумерного массива, которые больше нуля
     *
     * @param array
     * @return
     */
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0)
                    sum += array[i][j];
            }
        }
        return sum;
    }

    /**
     * Метод, рисующий квадрат со сторонами, заданной длины
     *
     * @param size длина стороны
     */
    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Метод для вывода массива в консоль
     *
     * @param array
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод зануляющий две диагонали квадратного двумерного массива
     *
     * @param array
     */
    public static void fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - i - 1] = 0;
        }
    }

    /**
     * Метод для поиска максимального элемента в массиве
     *
     * @param array
     * @return
     */
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Метод вычисляющий сумму второго столбца массива
     *
     * @param array
     * @return
     */
    public static int sumSecondColumn(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length >= 2) {
                sum += array[i][1];
            } else
               return -1;

        }
        return sum;
    }
}
