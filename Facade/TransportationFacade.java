public class TransportationFacade {

    private Bus bus;

    private Train train;

    public TransportationFacade() {

        bus = new Bus();

        train = new Train();

    }

    public void bookBusSeat() {

        System.out.println("Booking a bus seat...");

        bus.bookSeat();

        System.out.println("Bus seat booked successfully!");

    }

    public void bookTrainTicket() {

        System.out.println("Booking a train ticket...");

        train.bookTicket();

        System.out.println("Train ticket booked successfully!");

    }

}
