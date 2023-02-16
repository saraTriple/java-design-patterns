package src.state2;

public class AlertStateContext {
    private MobileState currentState;

    public AlertStateContext() {
        this.currentState = new Vibration();
    }

    public void setCurrentState(MobileState currentState) {
        this.currentState = currentState;
    }

    public void alert() {
        currentState.alert(this);
    }
}
