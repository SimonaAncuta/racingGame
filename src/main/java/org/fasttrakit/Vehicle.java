package org.fasttrakit;

public class Vehicle {

    public static String controlType = "Radio Control";
    private String name;
    private String color;
    private double currentSpeed;

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

    public double accelerate(double speed) {
        System.out.println("Accelerate implementation from Vehicle");
        currentSpeed += speed;

        return currentSpeed / 60;

    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double accelerate(double speed, double time)  {
        return 20;
    }

    public static String getControlType() {
        return controlType;
    }

    public static void setControlType(String controlType) {
        Vehicle.controlType = controlType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
