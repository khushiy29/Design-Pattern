import java.util.*;

class TransportationSystemMemento {

    private List<Bus> buses;

    private List<Train> trains;

    public TransportationSystemMemento(List<Bus> buses, List<Train> trains) {

        this.buses = new ArrayList<>(buses);

        this.trains = new ArrayList<>(trains);

    }

    public List<Bus> getBuses() {

        return buses;

    }

    public List<Train> getTrains() {

        return trains;

    }

}