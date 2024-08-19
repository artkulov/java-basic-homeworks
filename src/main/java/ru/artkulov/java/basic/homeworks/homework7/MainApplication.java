package ru.artkulov.java.basic.homeworks.homework7;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.*;

public class MainApplication {
    public static void main(String[] args) {
        Car car = new Car(1000);
        Bicycle bicycle = new Bicycle();
        Horse horse = new Horse(5000);
        TerrainVehicle terrainVehicle = new TerrainVehicle(2000);
        Human human = new Human("Вася");
    }
}
