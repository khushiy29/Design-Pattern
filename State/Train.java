public class Train {

    private TransportationSystemContext context;

    public Train(TransportationSystemContext context) {

        this.context = context;

    }

    public void operate(String weather) {

        context.operateTrains(weather);

    }

}