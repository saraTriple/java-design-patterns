package src.state;

public class Off implements FanState{
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentState(new Low());
        System.out.println("Low Speed");
    }
}
