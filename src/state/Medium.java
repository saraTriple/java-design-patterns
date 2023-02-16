package src.state;

public class Medium implements FanState{
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentState(new High());
        System.out.println("High Speed");
    }
}
