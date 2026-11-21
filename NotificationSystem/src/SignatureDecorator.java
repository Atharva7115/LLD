public class SignatureDecorator extends Notificationdecorater {
    public SignatureDecorator(INotification n) {
        super(n) ;

    }

    @Override
    public String getContent() {
        return n.getContent() + "\n— Team Zomato";
    }
}
