package ru.artkulov.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public String isHungry() {
        return isHungry ? name + " голоден" : name + " сыт";
    }

    public void eat(Plate plate) {
        if (isHungry) {
            if (plate.getCurrentAmmountOfFood() < appetite) {
                System.out.println(name + " не поел, потому что ему мало еды");
            } else {
                System.out.println(name + " поел");
                plate.decreaseFood(appetite);
                isHungry = false;
            }

        } else {
            System.out.println(name + " не голоден");
        }
    }
}
