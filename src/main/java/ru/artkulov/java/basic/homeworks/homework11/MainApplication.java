package ru.artkulov.java.basic.homeworks.homework11;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        PersonDataBase<Person> personDataBase = new PersonDataBase<>();
        Person person1 = new Person(1L, "Ivan", Position.DRIVER);
        Person person2 = new Person(2L, "Pyotr", Position.PLUMBER);
        Person person3 = new Person(3L, "Alex", Position.DIRECTOR);
        Person person4 = new Person(4L, "Sasha", Position.SENIOR_MANAGER);
        Person person5 = new Person(5L, "Nikolay");

        personDataBase.add(person1);
        personDataBase.add(person2);
        personDataBase.add(person3);
        personDataBase.add(person4);
        personDataBase.add(person5);

        for (Long personId : List.of(1L, 2L, 3L, 4L, 5L)) {
            System.out.println(personDataBase.findById(personId));
            System.out.println(personDataBase.isManager(personDataBase.findById(personId)));
            System.out.println(personDataBase.isEmployee(personId));
            System.out.println("-------");
        }

    }
}
