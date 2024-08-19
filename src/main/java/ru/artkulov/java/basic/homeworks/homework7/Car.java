package ru.artkulov.java.basic.homeworks.homework7;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.PLAIN;

public class Car implements Transport {
    private double fuel;
    private static final double FUEL_FLOW = 10;
    private final TerrainType[] possibleTerrainTypes = {PLAIN};

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getType() {
        return "Машина";
    }

    @Override
    public boolean drive(int distance, TerrainType terrainType) {
        if (!isPossibleToMove(this.possibleTerrainTypes, terrainType)) {
            System.out.println("Машина не может проехать по местности " + terrainType);
            return false;
        }

        if ((this.maxDistance() - distance) < 0) {
            System.out.println("У машины не хватит топлива, чтобы проехать " + distance + " км");
            System.out.println("Машина может проехать " + this.maxDistance() + " км.");
            return false;
        }

        fuel -= (distance * FUEL_FLOW);
        System.out.println("Машина проехала " + distance + " км, по "
                + terrainType + ", топлива осталось: " + fuel + " литров");
        return true;
    }

    @Override
    public double maxDistance() {
        return fuel / FUEL_FLOW;
    }
}





