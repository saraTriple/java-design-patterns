package src.Factory2;

public class NotificationFactory {

    public Notification createNotification(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            return null;
        }

        switch (name) {
            case "SMS":
                return new SMS();
            case "EMAIL":
                return new Email();
            case "PUSH":
                 return new PushNot();
            default:
                throw new IllegalArgumentException("Unknown Notification Service");
        }

    }
}
