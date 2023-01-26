package src.Factory2;

public class Client {


    public static void main(String[] args) {
        Factory();
    }

    public static void Factory() {
        NotificationFactory notificationFactory = new NotificationFactory();

        System.out.println("Sending SMS:");
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        System.out.println("Sending Push:");
        Notification notification1 = notificationFactory.createNotification("PUSH");
        notification1.notifyUser();


    }
}
