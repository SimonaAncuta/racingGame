package org.fasttrakit;

public class Vehicle {

    public static String controlType = "Radio Control";
    private String name;
    private String color;

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

        System.out.println(speed);

        return 10.1;


    }

    public double accelerate(double speed, double time)  {
        return 20;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
