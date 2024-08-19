package ru.artkulov.java.basic.homeworks.homework7;

public interface Transport {
    double DISTANCE_1_KM = 1;

    String getType();

    boolean drive(int distance, TerrainType terrainType);

    double maxDistance();

    default boolean isPossibleToMove(TerrainType[] possibleTerrainTypes,
                                     TerrainType terrainType) {
        if (possibleTerrainTypes == null
                || possibleTerrainTypes.length == 0
                || terrainType == null) {
            return false;
        }

        for (TerrainType type : possibleTerrainTypes) {
            if (type == terrainType) {
                return true;
            }
        }
        return false;
    }
}
