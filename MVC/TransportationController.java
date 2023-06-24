// controller class for transportation

import java.util.Scanner;

import java.util.List;

public class TransportationController {

    private TransportationModel model;

    private TransportationView view;

    private Scanner scanner;

    public TransportationController(TransportationModel model, TransportationView view) {

        this.model = model;

        this.view = view;

        scanner = new Scanner(System.in);

    }

    public void addBus() {

        System.out.print("Enter bus name: ");

        String name = scanner.nextLine();

        System.out.print("Enter bus capacity: ");

        int capacity = scanner.nextInt();

        scanner.nextLine();

        Bus bus = new Bus(name, capacity);

        model.addBus(bus);

    }

    public void addTrain() {

        System.out.print("Enter train name: ");

        String name = scanner.nextLine();

        System.out.print("Enter train capacity: ");

        int capacity = scanner.nextInt();

        scanner.nextLine();

        Train train = new Train(name, capacity);

        model.addTrain(train);

    }

    public void showBuses() {

        List<Bus> buses = model.getBuses();

        view.printBuses(buses);

    }

    public void showTrains() {

        List<Train> trains = model.getTrains();

        view.printTrains(trains);

    }

}