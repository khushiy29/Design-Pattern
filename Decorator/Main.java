public class Main {

    public static void main(String[] args) {

        TransportSystem train = new Train();

        train.showTransportInfo();

        TransportSystem trainWithWifi = new TrainWithWifi(new Train());

        trainWithWifi.showTransportInfo();

        TransportSystem bus = new Bus();

        bus.showTransportInfo();

        TransportSystem busWithAC = new BusWithAC(new Bus());

        busWithAC.showTransportInfo();

    }

}