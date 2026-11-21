public class Logger  implements  IObserver {
    @Override
    public void update(String m) {
        System.out.println("[LOG] " + m);
    }
}
