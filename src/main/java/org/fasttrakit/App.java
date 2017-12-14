package org.fasttrakit;

public class App {
    public static void main(String[] args) {
        Race race = new Race();
        Track track = new Track();
        track.setLength(100.5);
        race.setTrack(track);

        race.start();




    }
}