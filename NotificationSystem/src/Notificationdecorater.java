public abstract  class Notificationdecorater implements INotification {
   protected INotification n ;
    public  Notificationdecorater( INotification n) {
        this.n =  n ;
    }
    @Override
    public String getContent() {
        return n.getContent() ;
    }
}
