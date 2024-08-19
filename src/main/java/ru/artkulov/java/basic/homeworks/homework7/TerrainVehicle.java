package ru.artkulov.java.basic.homeworks.homework7;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.*;

public class TerrainVehicle implements Transport {
    private double fuel;
    private static final double FUEL_FLOW = 20;
    private final TerrainType[] possibleTerrainTypes = {PLAIN, THICKFOREST, SWAMP};

    public TerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getType() {
        return "Вездеход";
    }

    @Override
    public boolean drive(int distance, TerrainType terrainType) {
        if (!isPossibleToMove(this.possibleTerrainTypes, terrainType)) {
            System.out.println("Вездеход не может проехать по местности " + terrainType);
            return false;
        }

        if ((this.maxDistance() - distance) < 0) {
            System.out.println("У вездехода не хватит топлива, чтобы проехать " + distance + " км");
            System.out.println("Вездеход может проехать " + this.maxDistance() + " км.");
            return false;
        }

        fuel -= (distance * FUEL_FLOW);
        System.out.println("Вездеход проехал " + distance + " км, по "
                + terrainType + ", топлива осталось: " + fuel + " литров");
        return true;
    }

    @Override
    public double maxDistance() {
        return fuel / FUEL_FLOW;
    }
}
