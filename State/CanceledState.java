public class CanceledState implements TransportationState {

    public void operateBuses(String weather) {

        System.out.println("All bus services are canceled due to " + weather + " weather conditions.");

    }

    public void operateTrains(String weather) {

        System.out.println("All train services are canceled due to " + weather + " weather conditions.");

    }

}