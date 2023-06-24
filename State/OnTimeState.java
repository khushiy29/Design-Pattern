public class OnTimeState implements TransportationState {

    public void operateBuses(String weather) {

        if (weather.equals("sunny")) {

            System.out.println("All buses are running on time.");

        } else {

            System.out.println("Buses are delayed due to " + weather + " weather conditions.");

        }

    }

    public void operateTrains(String weather) {

        if (weather.equals("sunny")) {

            System.out.println("All trains are running on time.");

        } else {

            System.out.println("Trains are delayed due to " + weather + " weather conditions.");

        }

    }

}