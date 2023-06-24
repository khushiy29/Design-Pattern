import java.util.ArrayList;

import java.util.List;

// implementing observer design pattren for transportation system

// Observer interface

interface Observer {

    void update(String message);

}

// Subject interface

interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);

}

// Concrete Subject

class TransportationSystem implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {

        observers.add(observer);

    }

    public void removeObserver(Observer observer) {

        observers.remove(observer);

    }

    public void notifyObservers(String message) {

        for (Observer observer : observers) {

            observer.update(message);

        }

    }

    public void trainArriving() {

        String message = "Train is arriving at the station.";

        System.out.println(message);

        notifyObservers(message);

    }

    public void busArriving() {

        String message = "Bus is arriving at the stop.";

        System.out.println(message);

        notifyObservers(message);

    }

}

// Concrete Observer

class Passenger implements Observer {

    private String name;

    public Passenger(String name) {

        this.name = name;

    }

    public void update(String message) {

        System.out.println(name + " received a notification: " + message);

    }

}

// Main class

public class Main {

    public static void main(String[] args) {

        TransportationSystem transportationSystem = new TransportationSystem();

        Passenger passenger1 = new Passenger("John");

        transportationSystem.registerObserver(passenger1);

        Passenger passenger2 = new Passenger("Jane");

        transportationSystem.registerObserver(passenger2);

        transportationSystem.trainArriving();

        transportationSystem.busArriving();

        transportationSystem.removeObserver(passenger1);

        transportationSystem.trainArriving();

        transportationSystem.busArriving();

    }

}