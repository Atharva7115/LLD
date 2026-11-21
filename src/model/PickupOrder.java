package model;

public class PickupOrder {
    private String pickupCode ;
    public  PickupOrder(  String id,
                          User user,
                          Restaurant restaurant,
                          Cart cart,
                          String pickupCode) {
        super(id , user , restaurant , cart)  ;
            this.pickupCode = pickupCode ;
        }

    public String getPickupCode() {
        return pickupCode;
    }
}
