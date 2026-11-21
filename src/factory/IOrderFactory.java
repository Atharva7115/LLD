package factory;


import model.*;

public interface IOrderFactory {

    DeliveryOrder createOrder(
            String id,
            User user,
            Restaurant restaurant,
            Cart cart
    );
}



