// Step 1: Create an interface
interface Notification {
    String send(String message);
    String status();
}

// Step 2: Create concrete classes implementing the same interface
class EmailNotification implements Notification {
    public String send(String msg) {
        return "Email sent: " + msg;
    }
    public String status() {
        return "Email delivery successful";
    }
}

class SMSNotification implements Notification {
    public String send(String msg) {
        return "SMS sent: " + msg;
    }
    public String status() {
        return "SMS delivery successful";
    }
}

class PushNotification implements Notification {
    public String send(String msg) {
        return "Push notification sent: " + msg;
    }
    public String status() {
        return "Push notification delivered";
    }
}


// Step 3: Factory Class for object creation
class NotificationFactory {
    public static Notification create(String type) {
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown notification type");
        };
    }
}

// Step 4: Create Client / Main Class
public class NotificationService {

    public String notifyUser(String type, String message) {
        Notification n = NotificationFactory.create(type);
        return n.send(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        System.out.println(service.notifyUser("SMS", "Your order is confirmed"));
    }
}

