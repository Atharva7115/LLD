
package service;

import model.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantManager {

    private final List<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            throw new IllegalArgumentException(
                    "Restaurant cannot be null."
            );
        }

        restaurants.add(restaurant);
    }

    public Restaurant findRestaurantById(String restaurantId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId().equals(restaurantId)) {
                return restaurant;
            }
        }

        return null;
    }

    public List<Restaurant> getAllRestaurants() {
        return Collections.unmodifiableList(restaurants);
    }
}
