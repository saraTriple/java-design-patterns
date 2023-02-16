package src.state;

public class High implements FanState{
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentState(new Off());
        System.out.println("Turning Fan Off");
    }
}
