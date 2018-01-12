package org.fasttrakit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {

    private Track track;
    private List<Vehicle> competitors = new ArrayList<Vehicle>();
    private int competitorCount = 2;

    private String readVehicleName() {
        System.out.println("Please enter your vehicle's name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Your vehicle's name is: " + name);

        return name;

    }

    private double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter acceleration speed as decimal number");

        Scanner scanner = new Scanner(System.in);

        double speed = 0;
        try {
            speed = scanner.nextDouble();
        } catch (InputMismatchException exception) {
 //           throw new Exception("Please enter a valid decimal number");
            System.out.println("Please enter a valid decimal number");

            return readAccelerationSpeed();
        }

        System.out.println("You accelerated with " + speed + "km/h");

        return speed;
    }

    private void addCompetitor() {
        String vehicleName = readVehicleName();

        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleName);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(8,20));

        System.out.println("Your vehicle's mileage is " + vehicle.getMileage());
        competitors.add(vehicle);
    }

    private void addAllCompetitors() {
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }
    }

    public void start () throws Exception {
        addAllCompetitors();

        boolean noWinnerYet = true;

        while (noWinnerYet) {
            for (Vehicle vehicle : competitors) {
                double speed = readAccelerationSpeed();

                vehicle.accelerate(speed);

                if (vehicle.getTravelDistance() >= track.getLength()) {

                    System.out.println("The winner is: " + vehicle.getName());
                    noWinnerYet = false;
                }
            }
        }



    }



//     private Vehicle[] competitors = new Vehicle[10];
//
//    private List<Vehicle> competitorList = new ArrayList<Vehicle>();
//
//
//    public void start() {
//    Engine engine = new Engine();
//        engine.setManufacturer("Volvo");
//        Vehicle firstCompetitor = createCompetitor(engine, "Volvo", "red", 40, 8.5, 4);
//
//
//        Engine secondEngine = new Engine();
//        secondEngine.setManufacturer("Toyota");
//        Vehicle secondCompetitor = createCompetitor(secondEngine, "Toyota", "blue", 60, 10.9, 3);
//
//        competitors[0] = firstCompetitor;
//        competitors[1] = secondCompetitor;
//        System.out.println(competitors[0].getName());
//        System.out.println(competitors[1].getName());
//
//        for (int i = 0; i < competitors.length; i++) {
//
//            if (competitors[i] != null) {
//
//                System.out.println("Competitor " + i + ": " + competitors[i].getName());
//
//
//            }
//
//        }
//        // enhanced for
//        for (Vehicle vehicle : competitors) {
//            if (vehicle != null) {
//                System.out.println(vehicle.getName());
//            }
//
//
//            // for loops used in the same way for arrays and lists
//            if (vehicle != null) {
//                System.out.println(vehicle.getName());
//            }
//            competitorList.get(0);
//            competitorList.add(new Vehicle());
//            competitorList.add(1 , new Vehicle());
//
//        }
//    }
//
//
//    // parameters contain car prefix just to demo they can have any name
//
//    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMilage, int carDoorCount) {
//        Car competitor = new Car(carEngine);
//        competitor.setName(carName);
//        competitor.setColor(carColor);
//        competitor.setFuelLevel(carFuelLevel);
//        competitor.setMileage(carMilage);
//        competitor.setDoorCount(carDoorCount);
//
//        return competitor;
//    }


    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}

