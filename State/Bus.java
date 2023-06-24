// Bus.java

public class Bus {

    private TransportationSystemContext context;

    public Bus(TransportationSystemContext context) {

        this.context = context;

    }

    public void operate(String weather) {

        context.operateBuses(weather);

    }

}