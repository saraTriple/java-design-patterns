package src.state;

public class PullingFan {
    private FanState currentState;

    public PullingFan() {
        this.currentState = new Off();
    }

    public void setCurrentState(FanState currentState) {
        this.currentState = currentState;
    }

    public void push() {
        currentState.push(this);
    }
}
