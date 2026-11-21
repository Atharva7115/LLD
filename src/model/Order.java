
package model;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class Order {

    public enum Status {
        PLACED,
        CONFIRMED,
        PREPARING,
        READY,
        OUT_FOR_DELIVERY,
        DELIVERED,
        CANCELLED
    }

    private final String id;
    private final User user;
    private final Restaurant restaurant;
    private final Map<String, OrderItem> items;
    private final LocalDateTime createdAt;

    private Status status;
    private final double totalAmount;

    public Order(String id, User user, Restaurant restaurant, Cart cart) {
        if (user == null || restaurant == null || cart == null) {
            throw new IllegalArgumentException(
                    "User, restaurant, and cart are required."
            );
        }

        if (cart.isEmpty()) {
            throw new IllegalArgumentException(
                    "Cannot place an order with an empty cart."
            );
        }

        if (cart.getRestaurant() != restaurant) {
            throw new IllegalArgumentException(
                    "Cart and order must belong to the same restaurant."
            );
        }

        this.id = UUID.randomUUID().toString();
        this.user = user;
        this.restaurant = restaurant;
        this.createdAt = LocalDateTime.now();
        this.status = Status.PLACED;

        Map<String, OrderItem> orderItems = new LinkedHashMap<>();
        double total = 0.0;

        for (Map.Entry<MenuItem, Integer> entry
                : cart.getItems().entrySet()) {

            MenuItem menuItem = entry.getKey();
            int quantity = entry.getValue();

            OrderItem orderItem = new OrderItem(
                    menuItem.getId(),
                    menuItem.getName(),
                    menuItem.getPrice(),
                    quantity
            );

            orderItems.put(menuItem.getId(), orderItem);
            total += orderItem.getSubtotal();
        }

        this.items = Collections.unmodifiableMap(orderItems);
        this.totalAmount = total;
    }

    public void updateStatus(Status newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException(
                    "Status cannot be null."
            );
        }

        if (status == Status.DELIVERED || status == Status.CANCELLED) {
            throw new IllegalStateException(
                    "A completed order cannot change status."
            );
        }

        this.status = newStatus;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Map<String, OrderItem> getItems() {
        return items;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Status getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public static class OrderItem {

        private final String menuItemId;
        private final String name;
        private final double unitPrice;
        private final int quantity;

        public OrderItem(
                String menuItemId,
                String name,
                double unitPrice,
                int quantity) {

            this.menuItemId = menuItemId;
            this.name = name;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public String getMenuItemId() {
            return menuItemId;
        }

        public String getName() {
            return name;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getSubtotal() {
            return unitPrice * quantity;
        }
    }
}
