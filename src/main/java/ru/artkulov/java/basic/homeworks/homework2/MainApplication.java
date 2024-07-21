package ru.artkulov.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 9, 8, 6};
        int[] array1= {4,2,1,1,1,2,1,1,1,1};

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
        int size = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (size < arrays[i].length) {
                size = arrays[i].length;
            }
        }
        int[] sum = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum[j] += arrays[i][j];
            }
            System.out.println(Arrays.toString(arrays[i]));
        }
        System.out.println("Результат:\n" + Arrays.toString(sum));
    }

    public static void balanceLeftAndRight(int[] array) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++) {
                right += array[j];
            }
            if (left==right){
                for (int k = 0; k < i; k++) {
                    System.out.print(array[k]+", ");
                }
                System.out.print(array[i]+", | ");
                for (int n = i+1; n <array.length-1; n++) {
                    System.out.print(array[n]+", ");
                }
                System.out.print(array[array.length-1]);
                break;
            }
            else{
                right=0;
            }



        }
    }


}
