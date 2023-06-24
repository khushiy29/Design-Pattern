public class BusWithAC implements TransportSystem {

    private TransportSystem bus;

    public BusWithAC(TransportSystem bus) {

        this.bus = bus;

    }

    @Override

    public void showTransportInfo() {

        bus.showTransportInfo();

        System.out.println("This bus also has air conditioning.");

    }

}