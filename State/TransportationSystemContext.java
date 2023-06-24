public class TransportationSystemContext {

    private TransportationState state;

    public TransportationSystemContext() {

        setState(new OnTimeState());

    }

    public void setState(TransportationState state) {

        this.state = state;

    }

    public void operateBuses(String weather) {

        state.operateBuses(weather);

    }

    public void operateTrains(String weather) {

        state.operateTrains(weather);

    }

}