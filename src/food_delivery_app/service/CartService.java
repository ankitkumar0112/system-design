package food_delivery_app.service;

import food_delivery_app.model.Cart;
import food_delivery_app.model.Menu;

public class CartService {
    private final Cart cart = new Cart();

    public CartService() {
    }

    public void addItem(Menu item) {
        cart.addItem(item);
        System.out.println("Item added to cart");
    }

    public void removeItem(Menu item) {
        cart.removeItem(item);
    }

    public double calculateTotal(int id) {
        return cart.getTotal(id);
    }
}
