import java.util.HashMap;

import java.util.Map;

public class TransportSystem {

    public static void main(String[] args) {

        TransportFactory transportFactory = new TransportFactory();

        // Create a bus and travel from London to Manchester

        Transport bus1 = transportFactory.getTransport("bus");

        bus1.travel("London", "Manchester");

        // Create a train and travel from Manchester to Glasgow

        Transport train1 = transportFactory.getTransport("train");

        train1.travel("Manchester", "Glasgow");

        // Create another bus and travel from Glasgow to Edinburgh

        Transport bus2 = transportFactory.getTransport("bus");

        bus2.travel("Glasgow", "Edinburgh");

    }

}

// Define a Transport interface that will be implemented by the Bus and Train
// classes

interface Transport {

    void travel(String from, String to);

}

// Define a Bus class that implements the Transport interface

class Bus implements Transport {

    private String name;

    public Bus(String name) {

        this.name = name;

        System.out.println("Creating a new bus with name " + name);

    }

    @Override

    public void travel(String from, String to) {

        System.out.println("Traveling by bus from " + from + " to " + to);

    }

}

// Define a Train class that implements the Transport interface

class Train implements Transport {

    private String name;

    public Train(String name) {

        this.name = name;

        System.out.println("Creating a new train with name " + name);

    }

    @Override

    public void travel(String from, String to) {

        System.out.println("Traveling by train from " + from + " to " + to);

    }

}

// Define a TransportFactory class that will manage the creation and sharing of
// Flyweight objects

class TransportFactory {

    private Map<String, Transport> transportMap = new HashMap<>();

    public Transport getTransport(String transportType) {

        // Try to retrieve an existing Flyweight object from the transportMap

        Transport transport = transportMap.get(transportType);

        // If the Flyweight object doesn't exist, create a new one and add it to the
        // transportMap

        if (transport == null) {

            if (transportType.equalsIgnoreCase("bus")) {

                transport = new Bus("Generic Bus");

            } else if (transportType.equalsIgnoreCase("train")) {

                transport = new Train("Generic Train");

            }

            transportMap.put(transportType, transport);

            System.out.println("Creating a new Flyweight object of type " + transportType);

        } else {

            System.out.println("Reusing existing Flyweight object of type " + transportType);

        }

        return transport;

    }

}