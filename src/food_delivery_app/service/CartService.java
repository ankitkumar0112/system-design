package food_delivery_app.service;

import food_delivery_app.model.Cart;
import food_delivery_app.model.MenuItem;
import java.util.List;

public class CartService {
    private final Cart cart;

    public CartService() {
        this.cart = new Cart();
    }

    public void addItem(MenuItem item) {
        cart.addItem(item);
        System.out.println("Item added: " + item.getName());
    }

    public void removeItem(MenuItem item) {
        cart.removeItem(item);
        System.out.println("Item removed: " + item.getName());
    }

    public List<MenuItem> getItems() {
        return cart.getItems();
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }

    public void clearCart() {
        cart.clear();
    }
}