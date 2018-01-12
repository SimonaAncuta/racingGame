package org.fasttrakit;

public class Vehicle {

    public static String controlType = "Radio Control";
    private String name;
    private String color;
    private double currentSpeed;
    private double travelDistance;
    private double mileage;
    private double fuelLevel;


    public void accelerate(double speed) {
        System.out.println("Accelerate implementation from AutoVehicle");
        setCurrentSpeed(getCurrentSpeed() + speed);

        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double travelDistance = finalSpeed / 60;

        double spentFuel = travelDistance * mileage / 100;

        fuelLevel -= spentFuel;
        // same as fuelLevel = fuelLevel - spentFuel
        travelDistance += currentSpeed/60;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double accelerate(double speed, double time) {
        return 20;
    }

    public static String getControlType() {
        return controlType;
    }

    public static void setControlType(String controlType) {
        Vehicle.controlType = controlType;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
