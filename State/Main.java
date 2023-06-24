public class Main {

    public static void main(String[] args) {

        TransportationSystemContext context = new TransportationSystemContext();

        Bus bus = new Bus(context);

        Train train = new Train(context);

        // Transportation system is on time

        System.out.println("Transportation system is on time.\n");

        bus.operate("sunny"); // All buses are running on time.

        train.operate("sunny"); // All trains are running on

        // Transportation system is delayed

        System.out.println("\nTransportation system is delayed.\n");

        context.setState(new DelayedState());

        bus.operate("sunny"); // Buses are running late.

        train.operate("sunny"); // Trains are running late.

        // Transportation system is canceled

        System.out.println("\nTransportation system is canceled.\n");

        context.setState(new CanceledState());

        bus.operate("sunny"); // All bus services are canceled due to sunny weather conditions.

        train.operate("sunny"); // All train services are canceled due to sunny weather conditions.

    }

}