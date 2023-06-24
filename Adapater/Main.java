// Interface for Vehicle
interface Vehicle {
    void getInfo();
}

// Bus implementation
class Bus implements Vehicle {
    public void getInfo() {
        System.out.println("This is a bus.");
    }
}

// Train implementation
class Train {
    public void getTrainInfo() {
        System.out.println("This is a train.");
    }
}

// Adapter class for Train to work with Bus interface
class TrainAdapter implements Vehicle {
    private Train train;

    public TrainAdapter(Train train) {
        this.train = train;
        
    }

    public void getInfo() {
        train.getTrainInfo();
        System.out.println("This is a bus (adapted from train).");
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Bus(), new TrainAdapter(new Train()) };

        // Calling the methods on all two objects
        for (Vehicle vehicle : vehicles) {
            System.out.println("--- " + vehicle.getClass().getSimpleName() + " Details ---");
            vehicle.getInfo();
            System.out.println();
        }
    }
}
