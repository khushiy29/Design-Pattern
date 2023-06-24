public class DelayedState implements TransportationState {

    public void operateBuses(String weather) {

        if (weather.equals("sunny")) {

            System.out.println("Buses are running late.");

        } else {

            System.out.println("Buses are further delayed due to " + weather + " weather conditions.");

        }

    }

    public void operateTrains(String weather) {
    
    if (weather.equals("sunny")) {
    
    System.out.println("Trains are running late.");
    
    } else {
    
    System.out.println("Trains are further delayed due to " + weather + " weather conditions.");
    
    }
    
    }
}