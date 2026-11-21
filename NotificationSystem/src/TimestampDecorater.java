import  java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;
public class TimestampDecorater extends  Notificationdecorater {
    public  TimestampDecorater(INotification n ) {
        super(n) ;
    }

    @Override
    public String getContent() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) ;
        return "[" + timestamp + "]" + n.getContent() ;

    }
}
