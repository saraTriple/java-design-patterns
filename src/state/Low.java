package src.state;

public class Low implements FanState{
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentState(new Medium());
        System.out.println("Medium Speed");

    }
}
