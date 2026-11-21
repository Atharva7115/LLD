package model;

public class User {
    private String name ;
    private final String id ;
    private String email ;
    private Cart cart ;
    public User(String id, String name, String email, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cart = new Cart(restaurant);
    }

    public void addToCart(MenuItem item , int quantity) {
        if(cart == null) {
            throw new IllegalStateException( "No active cart. Create a cart before adding items") ;
        }
        cart.addToCart(item , quantity);
    }

    public void assignCart(Cart cart) {
        if (cart == null) {
            throw new IllegalArgumentException(
                    "Cart cannot be null."
            );
        }

        this.cart = cart;
    }
    public double getCartTotal() {
        return cart == null ? 0.0 : cart.getTotal();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean hasCart() {
        return cart != null;
    }
    public String getEmail() {
        return email;
    }
}
