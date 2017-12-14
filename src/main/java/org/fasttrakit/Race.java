package org.fasttrakit;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Track track;

    private Vehicle[] competitors = new Vehicle[10];

    private List<Vehicle> competitorList = new ArrayList<Vehicle>();


    public void start() {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");
        Vehicle firstCompetitor = createCompetitor(engine, "Volvo", "red", 40, 8.5, 4);


        Engine secondEngine = new Engine();
        secondEngine.setManufacturer("Toyota");
        Vehicle secondCompetitor = createCompetitor(secondEngine, "Toyota", "blue", 60, 10.9, 3);

        competitors[0] = firstCompetitor;
        competitors[1] = secondCompetitor;
        System.out.println(competitors[0].getName());
        System.out.println(competitors[1].getName());

        for (int i = 0; i < competitors.length; i++) {

            if (competitors[i] != null) {

                System.out.println("Competitor " + i + ": " + competitors[i].getName());


            }

        }
        // enhanced for
        for (Vehicle vehicle : competitors) {
            if (vehicle != null) {
                System.out.println(vehicle.getName());
            }


            // for loops used in the same way for arrays and lists
            if (vehicle != null) {
                System.out.println(vehicle.getName());
            }
            competitorList.get(0);
            competitorList.add(new Vehicle());
            competitorList.add(1 , new Vehicle());

        }
    }


    // parameters contain car prefix just to demo they can have any name

    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMilage, int carDoorCount) {
        Car competitor = new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuelLevel(carFuelLevel);
        competitor.setMileage(carMilage);
        competitor.setDoorCount(carDoorCount);

        return competitor;
    }


    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}

