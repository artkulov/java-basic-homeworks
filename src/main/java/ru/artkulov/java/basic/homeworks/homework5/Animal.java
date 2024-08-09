package ru.artkulov.java.basic.homeworks.homework5;

public abstract class Animal {
    String name;
    int speedOfRun;
    int speedOfSwim;
    int endurance;


    public abstract int swim(int distance);

    public int run(int distance) {
        if (distance > endurance) {
            System.out.println(name + " не может пробежать столько.\nСил осталось на " + endurance + " метров");
            return -1;
        } else {
            endurance -= distance;
            return (distance / speedOfRun);

        }
    }

    public void info() {
        System.out.println("Имя: " + name + "\nСкорость бега: " +
                speedOfRun + "\nСкорость плавания: " + speedOfSwim + "\nВыносливость: " + endurance);
    }
}
