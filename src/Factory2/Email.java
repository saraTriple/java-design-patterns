package src.Factory2;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Sent");
    }
}
