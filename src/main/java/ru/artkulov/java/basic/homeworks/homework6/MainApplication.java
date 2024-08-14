package ru.artkulov.java.basic.homeworks.homework6;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(33);
        Cat[] cat = new Cat[]{new Cat("Barsik", 15), new Cat("Murzik", 10),
                new Cat("Rizhik", 5), new Cat("Kuzya", 5)};

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(plate.getCurrentAmmountOfFood());
        }

        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].isHungry());
        }

    }
}
