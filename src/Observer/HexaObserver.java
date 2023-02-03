package src.Observer;

public class HexaObserver extends Observery{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
