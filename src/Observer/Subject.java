package src.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observery> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribeToList(Observery observery) {
        observers.add(observery);
    }


    public void notifyAllObservers() {
        for (Observery o: observers) {
            o.update();
        }
    }
}
