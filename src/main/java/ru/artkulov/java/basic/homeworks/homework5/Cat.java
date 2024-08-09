package ru.artkulov.java.basic.homeworks.homework5;

public class Cat extends Animal {

    public Cat(String name, int speedOfRun, int endurance) {
        this.name = name;
        this.speedOfRun = speedOfRun;
        this.endurance = endurance;
    }


    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return 0;
    }

    @Override
    public void info() {
        System.out.println("Имя: " + name + "\nСкорость бега: " +
                speedOfRun + "\nВыносливость: " + endurance);
    }
}
