package src.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Saving memento
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // Restoring memento
    public void getStateFromMemento(Memento momento) {
        state = momento.getState();

    }
}
