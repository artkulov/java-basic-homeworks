package ru.artkulov.java.basic.homeworks.homework5;

public class Horse extends Animal{
    public Horse(String name, int speedOfRun, int speedOfSwim, int endurance) {
        this.name = name;
        this.speedOfRun = speedOfRun;
        this.speedOfSwim=speedOfSwim;
        this.endurance = endurance;
    }
    @Override
    public int swim(int distance) {
        if (distance * 4 > endurance) {
            System.out.println(name + " не может проплыть столько.\nСил осталось на " + endurance / 4 + " метров");
            return -1;
        } else {
            endurance -= distance * 4;
            return (distance / speedOfSwim);
        }
    }
}
