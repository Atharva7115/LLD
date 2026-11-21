package model;
import java.util.Collections ;
import java.util.LinkedHashMap ;
import java.util.Map ;


public class Cart {
    private Restaurant restaurant;
    private Map<MenuItem, Integer> items;

    public Cart(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.items = new LinkedHashMap<>();

    }

    public void addToCart(MenuItem item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (!item.isAvailable()) {
            throw new IllegalArgumentException("Item is unavailable");
        }
        items.merge(item, quantity, Integer::sum);
    }

    public void removeFromCart(MenuItem item) {
        items.remove(item);
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            MenuItem item = entry.getKey();
            int value = entry.getValue();
            total += item.getPrice() * value;

        }
        return total;
    }
    public  Restaurant getRestaurant() {
        return restaurant ;
    }

    public Map<MenuItem, Integer> getItems() {
        return Collections.unmodifiableMap(items);
    }
    public  boolean isEmpty() {
        return items.size() == 0 ;
    }
}


