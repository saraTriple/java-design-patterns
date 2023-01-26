package src.Factory2;

public class PushNot implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push Notification Sent");
    }
}
