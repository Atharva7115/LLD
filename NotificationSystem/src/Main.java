public class Main {
    public static void main(String[] args) {

        INotification n = new TimestampDecorater(new SimpleNotification("simple notification")) ;
        System.out.println(n.getContent());
    }
}