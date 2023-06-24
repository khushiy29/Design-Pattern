import java.util.*;

// it has defination of adding and removing bus and train

class TransportationSystem {

    private List<Bus> buses;

    private List<Train> trains;

    public TransportationSystem() {

        this.buses = new ArrayList<>();

        this.trains = new ArrayList<>();

    }

    public void addBus(Bus bus) {

        buses.add(bus);

        System.out.println("Added bus " + bus.getId());

    }

    public void addTrain(Train train) {

        trains.add(train);

        System.out.println("Added train " + train.getId());

    }

    public void removeBus(Bus bus) {

        buses.remove(bus);

        System.out.println("Removed bus " + bus.getId());

    }

    public void removeTrain(Train train) {

        trains.remove(train);

        System.out.println("Removed train " + train.getId());

    }

    public TransportationSystemMemento save() {

        return new TransportationSystemMemento(buses, trains);

    }

    public void restore(TransportationSystemMemento memento) {

        buses = memento.getBuses();

        trains = memento.getTrains();

    }

    public void printStatus() {

        System.out.println("Current transportation system status:");

        System.out.println("Buses: " + buses.size());

        for (Bus bus : buses) {

            System.out.println(" " + bus.getId());

        }

        System.out.println("Trains: " + trains.size());

        for (Train train : trains) {

            System.out.println(" " + train.getId());

        }

    }

}