//view class for transportation

import java.util.List;

import java.util.Scanner;

public class TransportationView {

    public void printBuses(List<Bus> buses) {

        System.out.println("Available Buses:");

        for (Bus bus : buses) {

            System.out.println(bus);

        }

        System.out.println();

    }

    public void printTrains(List<Train> trains) {

        System.out.println("Available Trains:");

        for (Train train : trains) {

            System.out.println(train);

        }

        System.out.println();

    }

}