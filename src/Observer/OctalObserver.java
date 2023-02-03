package src.Observer;

public class OctalObserver extends Observery{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
