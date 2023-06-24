import java.util.ArrayList;
import java.util.List;

interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Bus implements Vehicle {
    private List<Vehicle> subVehicles = new ArrayList<>();

    @Override
    public void startEngine() {
        System.out.println("Bus Engine Started");
        for (Vehicle subVehicle : subVehicles) {
            subVehicle.startEngine();
        }
    }

    @Override
    public void stopEngine() {
        for (Vehicle subVehicle : subVehicles) {
            subVehicle.stopEngine();
        }
        System.out.println("Bus Engine Stopped");
    }

    public void addSubVehicle(Vehicle vehicle) {
        subVehicles.add(vehicle);
    }

    public void removeSubVehicle(Vehicle vehicle) {
        subVehicles.remove(vehicle);
    }
}

class Train implements Vehicle {
    private List<Vehicle> subVehicles = new ArrayList<>();

    @Override
    public void startEngine() {
        System.out.println("Train Engine Started");
        for (Vehicle subVehicle : subVehicles) {
            subVehicle.startEngine();
        }
    }

    @Override
    public void stopEngine() {
        for (Vehicle subVehicle : subVehicles) {
            subVehicle.stopEngine();
        }
        System.out.println("Train Engine Stopped");
    }

    public void addSubVehicle(Vehicle vehicle) {
        subVehicles.add(vehicle);
    }

    public void removeSubVehicle(Vehicle vehicle) {
        subVehicles.remove(vehicle);
    }
}

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Train train1 = new Train();
        Train train2 = new Train();

        bus1.addSubVehicle(bus2);
        train1.addSubVehicle(train2);
        bus.addSubVehicle(bus1);
        train.addSubVehicle(train1);

        bus.startEngine();
        train.stopEngine();
    }
}

