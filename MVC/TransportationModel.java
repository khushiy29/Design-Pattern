//model class for transportation

import java.util.ArrayList;

import java.util.List;

public class TransportationModel {

    private List<Bus> buses;

    private List<Train> trains;

    public TransportationModel() {

        buses = new ArrayList<>();

        trains = new ArrayList<>();

    }

    public void addBus(Bus bus) {

        buses.add(bus);

    }

    public void addTrain(Train train) {

        trains.add(train);

    }

    public List<Bus> getBuses() {

        return buses;

    }

    public List<Train> getTrains() {

        return trains;

    }

}