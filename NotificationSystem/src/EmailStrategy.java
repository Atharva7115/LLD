public class EmailStrategy implements INotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
