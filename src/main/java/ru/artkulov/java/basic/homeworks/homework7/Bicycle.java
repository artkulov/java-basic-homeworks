package ru.artkulov.java.basic.homeworks.homework7;

import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.PLAIN;
import static ru.artkulov.java.basic.homeworks.homework7.TerrainType.THICKFOREST;

public class Bicycle implements Transport {
    private final TerrainType[] possibleTerrainTypes = {PLAIN, THICKFOREST};

    @Override
    public String getType() {
        return "Велосипед";
    }

    @Override
    public boolean drive(int distance, TerrainType terrainType) {
        if (!isPossibleToMove(this.possibleTerrainTypes, terrainType)) {
            System.out.println("Велосипед не может проехать по местности " + terrainType);
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " км, по "
                + terrainType);
        return true;
    }

    @Override
    public double maxDistance() {
        return 0;
    }
}
