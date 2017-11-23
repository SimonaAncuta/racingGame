package org.fasttrakit;

public class Race {

    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start() {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");
        firstCompetitor = createCompetitor(engine, "Volvo","red",40,8.5,4);

        System.out.println(firstCompetitor.toString());

        Engine secondEngine = new Engine();
        secondEngine.setManufacturer("Toyota");
        secondCompetitor = createCompetitor(secondEngine, "Toyota", "blue", 60, 10.9, 3);

        System.out.println(secondCompetitor.toString());


    }



    // parameters contain car prefix just to demo they can have any name

    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMilage, int carDoorCount)
    {
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

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}

