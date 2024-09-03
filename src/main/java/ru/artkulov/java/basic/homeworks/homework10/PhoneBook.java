package ru.artkulov.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();

    public void add(String surname, String phoneNumber) {
        if (phoneBook.get(surname) != null) {
            if (!phoneBook.get(surname).contains(phoneNumber)) {
                phoneBook.get(surname).add(phoneNumber);
            } else {
                System.out.println("Такой номер уже записан");
            }
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(surname, numbers);
        }
    }

    public void get(String surname) {
        System.out.println("|" + surname + "  | контактный(-ые) телефон(-ы) " + phoneBook.get(surname));
    }

}
