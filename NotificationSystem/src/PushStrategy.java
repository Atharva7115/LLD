
    public class PushStrategy implements INotificationStrategy {

        @Override
        public void send(String message) {
            System.out.println("Sending Push Notification: " + message);
        }
    }

