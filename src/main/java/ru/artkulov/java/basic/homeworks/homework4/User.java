package ru.artkulov.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int dateOfBirth;
    private String email;

    public int getDateOfBirth(){
        return dateOfBirth;
    }

    public User(String surname, String name, String patronymic, int dateOfBirth, String email){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.dateOfBirth=dateOfBirth;
        this.email=email;

    }

    public void info(){
        System.out.println("ФИО: "+surname+" "+name+" "+patronymic);
        System.out.println("Год рождения: "+dateOfBirth);
        System.out.println("Email: "+email);
    }
}
