package ru.artkulov.java.basic.homeworks.homework6;

public class Plate {
    private int maxAmmountOfFood;
    private int currentAmmountOfFood;

    public Plate(int maxAmmountOfFood) {
        this.maxAmmountOfFood = maxAmmountOfFood;
        this.currentAmmountOfFood = maxAmmountOfFood;
    }

    public int getCurrentAmmountOfFood() {
        return currentAmmountOfFood;
    }

    public void addFood(int foodAmmount) {
        if ((currentAmmountOfFood + foodAmmount) <= maxAmmountOfFood) {
            currentAmmountOfFood += foodAmmount;
        } else {
            System.out.println("В тарелку столько не влезет");
        }
    }

    public boolean decreaseFood(int amount) {
        this.currentAmmountOfFood -= amount;
        return this.currentAmmountOfFood >= 0;
    }
}
