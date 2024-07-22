package ru.artkulov.java.basic.homeworks.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 9, 8, 6};
        int[] array1 = {4, 2, 1, 1, 1, 2, 1, 1, 1};
        int[] array2 = {5, 4, 3, 2, 1};
        checkIncreasingDecreasing(array2);
    }

    //Метод,печатающий в консоль строку указанное количество раз
    public static void writeString(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // Метод, суммирующий элементы массива >5
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5)
                sum += array[i];
        }
        System.out.println("Сумма элементов массива, значение которых больше 5 = " + sum);
    }

    //Метод заполнения массива указанным числом
    public static void fillArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
        }
    }

    //Метод, увеличивающий каждый элемент массива на указанное число
    public static void increaseTheNumber(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
        }
        System.out.println(Arrays.toString(array));
    }

    // Метод, печатающий информацию о том, сумма элементов какой из половин массива больше
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
    // Метод получения суммы входящих массивов
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

    //Метод проверки наличия "точки", в которой сумма левой и правой части равны
    public static void balanceLeftAndRight(int[] array) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++) {
                right += array[j];
            }
            if (left == right) {
                for (int k = 0; k < i; k++) {
                    System.out.print(array[k] + ", ");
                }
                System.out.print(array[i] + ", | ");
                for (int n = i + 1; n < array.length - 1; n++) {
                    System.out.print(array[n] + ", ");
                }
                System.out.print(array[array.length - 1]);
                break;
            } else {
                right = 0;
            }


        }
    }

    //Метод, проверяющий стоят элементы в порядке возрастания или убывания
    public static void checkIncreasingDecreasing(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите режим проверки массива: \n1. По возрастанию.\n2. По убыванию");
        int option = sc.nextInt();
        int n=array[0];
        boolean check = true;
        if(option==1){
            for (int i = 0; i < array.length-1; i++) {
                if(array[i+1]<array[i]) {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("Элементы массива в порядке возрастания");
            else
                System.out.println("Элементы массива не в порядке возрастаия");
        }
        else if(option==2) {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i+1]>array[i]) {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("Элементы массива в порядке убывания");
            else
                System.out.println("Элементы массива не в порядке убывания");
        }
        else
            System.out.println("Неизвестный номер режима");
    }

    //Метод "переворачивающий" массив
    public static void flipArray(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int cache = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=cache;
        }
        System.out.println(Arrays.toString(array));
    }

}
