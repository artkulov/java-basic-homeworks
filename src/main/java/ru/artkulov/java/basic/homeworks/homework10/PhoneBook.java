package ru.artkulov.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();

    public Map<String, ArrayList<String>> getContacts() {
        return phoneBook;
    }

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

    public void find(String surname) {
        System.out.println("|" + surname + "  | контактный(-ые) телефон(-ы) " + phoneBook.get(surname));
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (String fullName : phoneBook.keySet()) {
            if (phoneBook.get(fullName).contains(phoneNumber)) {
                System.out.println("Телефон " + phoneNumber + " есть в справочнике.");
                return true;
            }
        }
        return false;
    }

}