//main classs

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TransportationModel model = new TransportationModel();

        TransportationView view = new TransportationView();

        TransportationController controller = new TransportationController(model, view);

        controller.addBus();

        controller.addBus();

        controller.addTrain();

        controller.showBuses();

        controller.showTrains();

    }

}