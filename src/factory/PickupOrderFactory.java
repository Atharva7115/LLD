
package factory;

import model.*;

public class PickupOrderFactory implements IOrderFactory {

    private final String pickupCode;

    public PickupOrderFactory(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    @Override
    public DeliveryOrder createOrder(
            String id,
            User user,
            Restaurant restaurant,
            Cart cart) {

        return new PickupOrder(
                id,
                user,
                restaurant,
                cart,
                pickupCode
        );
    }
}

