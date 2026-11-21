
package factory;

import model.*;

public class DeliveryOrderFactory implements IOrderFactory {

    private final String deliveryAddress;

    public DeliveryOrderFactory(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public DeliveryOrder createOrder(
            String id,
            User user,
            Restaurant restaurant,
            Cart cart) {

        return new DeliveryOrder(
                id,
                user,
                restaurant,
                cart,
                deliveryAddress
        );
    }
}
