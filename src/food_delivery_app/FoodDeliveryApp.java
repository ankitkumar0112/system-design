package food_delivery_app;

import food_delivery_app.model.MenuItem;
import food_delivery_app.model.Restaurant;
import food_delivery_app.model.User;
import food_delivery_app.order.DeliveryOrder;
import food_delivery_app.order.Order;
import food_delivery_app.service.CartService;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        User user = new User(1, "John Doe", "9999999999");

        MenuItem kadhaiPaneer = new MenuItem(1, "Kadhai Paneer", 240.0);
        MenuItem dalMakhani = new MenuItem(2, "Dal Makhani", 160.0);

        Restaurant restaurant = new Restaurant(1, "Apni Rasoi", "Delhi");
        restaurant.addItem(kadhaiPaneer);
        restaurant.addItem(dalMakhani);

        CartService cartService = new CartService();
        cartService.addItem(kadhaiPaneer);
        cartService.addItem(dalMakhani);

        System.out.println("Cart Subtotal: ₹" + cartService.calculateTotal());

        Order order = new DeliveryOrder("ORD-101", user, restaurant, cartService.getItems(), "Rajiv Chowk, Delhi", 40.0);

        System.out.println("Total Bill (including delivery): ₹" + order.getTotal());
        order.placeOrder();

        cartService.clearCart();
    }
}