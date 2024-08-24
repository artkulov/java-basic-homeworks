package ru.artkulov.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30);
        Employee employee2 = new Employee("Mark", 25);
        Employee employee3 = new Employee("Lens", 35);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
        System.out.println(youngestEmployee(employees));

    }

    /**
     * Метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
     * последовательных значений в указанном диапазоне
     *
     * @param min минимальное число диапазона
     * @param max максимальное число диапазона
     * @return ArrayList
     */
    public static List<Integer> listMinMax(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    /**
     * Метод суммирующий все элементы,значение которых больше 5
     *
     * @param list ссылка на список целых чисел
     * @return сумма элементов, значение которых больше 5
     */
    public static int sumNumbersMore5OfList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    /**
     * Метод переписывает каждую заполненную ячейку списка указанным числом
     *
     * @param number число, которым переписывается список
     * @param list   ссылка на список, который необходимо переписать
     */
    public static void rewriteTheList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    /**
     * Метод увеличивающий каждый элемент списка на указанное число
     *
     * @param value число, на которое нужно увеличить значения списка
     * @param list  ссылка на список, значения которого нужно увеличить
     */
    public static void increaseNumberOfList(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
    }

    /**
     * Метод возвращающий список имен сотрудников
     *
     * @param employees список сотрудников
     * @return список имен сотрудников
     */
    public static List<String> getListOfNames(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        return names;
    }

    /**
     * Метод возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу
     *
     * @param employees список сотрудников
     * @param age       возраст для проверки
     * @return список имен сотрудников, возраст которых больше либо равен указанному аргументу
     */
    public static List<String> ageMoreThanValue(List<Employee> employees, int age) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() >= age)
                names.add(employees.get(i).getName());
        }
        return names;
    }

    /**
     * Метод проверяющий что средний возраст сотрудников превышает указанный аргумент;
     *
     * @param employees    список сотрудников
     * @param minMiddleAge минимальный средний возраст
     * @return true - средний возраст сотрудников больше минимального среднего возраста.
     * false - средний возраст сотрудников меньше либо равен минимальному среднему возрасту
     */
    public static boolean middleAge(List<Employee> employees, int minMiddleAge) {
        int sumOfAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            sumOfAge += employees.get(i).getAge();
        }
        int middleAge = sumOfAge / employees.size();
        return middleAge > minMiddleAge;
    }

    /**
     * Метод возвращающий ссылку на самого молодого сотрудника.
     * @param employees Список сотрудников
     * @return ссылка на самого молодого сотрудника
     */
    public static Employee youngestEmployee(List<Employee> employees) {
        Employee e;
        ArrayList<Employee> youngest = new ArrayList<>();
        e = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getAge() < e.getAge()) {
                e = employees.get(i);
            }
        }
        return e;
    }
}
