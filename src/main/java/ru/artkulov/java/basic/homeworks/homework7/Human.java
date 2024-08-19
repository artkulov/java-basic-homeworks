package ru.artkulov.java.basic.homeworks.homework7;

import java.util.Arrays;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.*;

public class Human {
    private String name;
    private int currentEnergy;
    private static final int MAX_ENERGY = 5000;
    public static final int CALLORIES_1KM = 75;
    private Transport currentTransport;
    private final TerrainType[] possibleTerrainTypes = {PLAIN, THICKFOREST, SWAMP};

    public Human(String name) {
        this.name = name;
        this.currentEnergy = MAX_ENERGY;
    }

    public void getOn(Transport transport) {
        if (this.currentTransport != null) {
            System.out.println("Нельзя использовать " + transport.getType() +
                    ", потому что человек уже использует " + currentTransport.getType());
            return;
        }
        this.currentTransport = transport;
        System.out.println("Человек использует " + currentTransport.getType());
    }

    public void getOutOfTransport() {
        if (this.currentTransport != null) {
            System.out.println("Человек больше не использует " + this.currentTransport.getType());
            this.currentTransport = null;
            return;
        }
        System.out.println("Человек не использует транспорт");
    }

    public boolean move(int distance, TerrainType terrainType) {
        if (this.currentTransport != null) {
            System.out.println("Человек поехал на " + this.currentTransport.getType());
            return drive(distance, terrainType);
        } else {
            System.out.println("Человек пошел пешком");
            return walk(distance, terrainType);
        }

    }

    private boolean drive(int distance, TerrainType terrainType) {
        boolean isMoved = this.currentTransport.drive(distance, terrainType);
        if (isMoved) {
            System.out.println("Человек смог проехать на " + this.currentTransport.getType());
            return true;
        } else {
            System.out.println("Человек не смог проехать на " + this.currentTransport.getType());
            return false;
        }
    }

    private boolean walk(int distance, TerrainType terrainType) {
        if (terrainType == null || !Arrays.asList(possibleTerrainTypes).contains(terrainType)) {
            System.out.println("Человек не может пройти по этой местности");
            return false;
        }
        if (currentEnergy < (distance * CALLORIES_1KM)) {
            System.out.println("Человек не может пройти это расстояние");
            System.out.println("Энергии осталось на " + (currentEnergy / CALLORIES_1KM) + " км");
            return false;
        }
        this.currentEnergy -= (distance * CALLORIES_1KM);
        System.out.println("Человек прошел расстояние " + distance +
                " по местности " + terrainType + ", осталось " + this.currentEnergy + " калорий");
        return true;
    }

}
