
package model;
;
public class DeliveryOrder extends Order {

    private String deliveryAddress;

    public DeliveryOrder(
            String id,
            User user,
            Restaurant restaurant,
            Cart cart,
            String deliveryAddress) {

        super(id, user, restaurant, cart);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}

