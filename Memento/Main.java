

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TransportationSystem transportationSystem = new TransportationSystem();

        transportationSystem.addBus(new Bus("Bus 1"));

        transportationSystem.addBus(new Bus("Bus 2"));

        transportationSystem.addTrain(new Train("Train 1"));

        transportationSystem.printStatus();

        TransportationSystemMemento memento = transportationSystem.save();

        transportationSystem.removeBus(new Bus("Bus 1"));

        transportationSystem.removeTrain(new Train("Train 1"));

        transportationSystem.printStatus();

        transportationSystem.restore(memento);

        transportationSystem.printStatus();

    }

}