package org.fasttrakit;

public class Car extends AutoVehicle {

    int doorCount;

    Car firstCompetitor;
    Car secondCompetitor;

    public Car(Engine engine) {
        super(engine);
    }

}
