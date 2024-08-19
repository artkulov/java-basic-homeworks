package ru.artkulov.java.basic.homeworks.homework7;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.PLAIN;
import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.THICKFOREST;

public class Horse implements Transport {
    private double energy;
    private static final double ENERGY_FLOW = 10;
    private final TerrainType[] possibleTerrainTypes = {PLAIN, THICKFOREST};

    public Horse(int energy) {
        this.energy = energy;
    }

    @Override
    public String getType() {
        return "Лошадь";
    }

    @Override
    public boolean drive(int distance, TerrainType terrainType) {
        if (!isPossibleToMove(this.possibleTerrainTypes, terrainType)) {
            System.out.println("Лошадь не может пройти по местности " + terrainType);
            return false;
        }

        if ((this.maxDistance() - distance) < 0) {
            System.out.println("У лошади не хватит энергии, чтобы пройти " + distance + " км");
            System.out.println("Лошадь может пройти " + this.maxDistance() + " км.");
            return false;
        }

        energy -= (distance * ENERGY_FLOW);
        System.out.println("Лошадь прошла " + distance + " км, по "
                + terrainType + ", энергии осталось: " + energy);
        return true;
    }

    @Override
    public double maxDistance() {
        return energy / ENERGY_FLOW;
    }
}
