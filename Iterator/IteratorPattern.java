import java.util.ArrayList;

import java.util.Iterator;

// implementing iterator design pattern in transportation system

// Iterator interface

interface VehicleIterator {

    boolean hasNext();

    Object next();

}

// Collection interface

interface VehicleCollection {

    void addVehicle(String vehicle);

    void removeVehicle(String vehicle);

    VehicleIterator getIterator();

}

// Concrete collection class

class Transportation implements VehicleCollection {

    private ArrayList<String> vehicles;

    public Transportation() {

        vehicles = new ArrayList<String>();

    }

    public void addVehicle(String vehicle) {

        vehicles.add(vehicle);

        System.out.println("Added " + vehicle + " to the collection.");

    }

    public void removeVehicle(String vehicle) {

        vehicles.remove(vehicle);

        System.out.println("Removed " + vehicle + " from the collection.");

    }

    public VehicleIterator getIterator() {

        return new VehicleIteratorImpl();

    }

    private class VehicleIteratorImpl implements VehicleIterator {

        private Iterator<String> iterator;

        public VehicleIteratorImpl() {

            iterator = vehicles.iterator();

        }

        public boolean hasNext() {

            return iterator.hasNext();

        }

        public Object next() {

            if (hasNext()) {

                return iterator.next();

            }

            return null;

        }

    }

}

// Client class

public class IteratorPattern {

    public static void main(String[] args) {

        Transportation transportation = new Transportation();

        transportation.addVehicle("Car");

        transportation.addVehicle("Bus");

        transportation.addVehicle("Train");

        VehicleIterator iterator = transportation.getIterator();

        System.out.println("Transportation vehicles:");

        while (iterator.hasNext()) {

            String vehicle = (String) iterator.next();

            System.out.println(" - " + vehicle);

        }

        transportation.removeVehicle("Bus");

        System.out.println("After removing Bus, remaining vehicles:");

        iterator = transportation.getIterator();

        while (iterator.hasNext()) {

            String vehicle = (String) iterator.next();

            System.out.println(" - " + vehicle);

        }

    }
}