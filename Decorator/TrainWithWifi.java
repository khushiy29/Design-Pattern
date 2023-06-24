public class TrainWithWifi implements TransportSystem {

    private TransportSystem train;

    public TrainWithWifi(TransportSystem train) {

        this.train = train;

    }

    @Override

    public void showTransportInfo() {

        train.showTransportInfo();

        System.out.println("This train also has WiFi.");

    }

}