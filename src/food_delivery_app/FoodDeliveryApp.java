package food_delivery_app;

import food_delivery_app.model.MenuItem;
import food_delivery_app.model.Restaurant;
import food_delivery_app.model.User;
import food_delivery_app.order.DeliveryOrder;
import food_delivery_app.order.Order;
import food_delivery_app.service.CartService;
import food_delivery_app.service.RestaurantManager;

import java.util.List;

public class FoodDeliveryApp {

    private static final String SEARCH_LOCATION = "Delhi";
    private static final String DELIVERY_ADDRESS = "Rajiv Chowk, Delhi";
    private static final double DELIVERY_FEE = 40.0;

    public static void main(String[] args) {

        User user = createUser();
        RestaurantManager manager = createRestaurants();

        System.out.println("Available Restaurants:");
        manager.getRestaurants().forEach(System.out::println);

        List<Restaurant> restaurants = manager.searchByLocation(SEARCH_LOCATION);

        if (restaurants.isEmpty()) {
            System.out.println("No restaurants found in " + SEARCH_LOCATION);
            return;
        }

        Restaurant selectedRestaurant = restaurants.get(0);

        System.out.println("\nSelected Restaurant: " + selectedRestaurant.getName());
        System.out.println("Menu Items: " + selectedRestaurant.getItems());

        CartService cartService = new CartService();
        selectedRestaurant.getItems().forEach(cartService::addItem);

        System.out.println("Cart Subtotal: ₹" + cartService.calculateTotal());

        Order order = new DeliveryOrder(
                "ORD-101",
                user,
                selectedRestaurant,
                cartService.getItems(),
                DELIVERY_ADDRESS,
                DELIVERY_FEE
        );

        System.out.println("Total Bill (including delivery): ₹" + order.getTotal());

        order.placeOrder();
        cartService.clearCart();
    }

    private static User createUser() {
        return new User(1, "John Doe", "9999999999");
    }

    private static RestaurantManager createRestaurants() {

        Restaurant apniRasoi = new Restaurant(1, "Apni Rasoi", "Delhi");
        apniRasoi.addItem(new MenuItem(1, "Kadhai Paneer", 240.0));
        apniRasoi.addItem(new MenuItem(2, "Dal Makhani", 160.0));

        Restaurant amrikSukhdev = new Restaurant(2, "Amrik Sukhdev", "Haryana");
        amrikSukhdev.addItem(new MenuItem(1, "Kadhai Paneer", 260.0));
        amrikSukhdev.addItem(new MenuItem(2, "Dal Makhani", 180.0));

        RestaurantManager manager = new RestaurantManager();
        manager.addRestaurant(apniRasoi);
        manager.addRestaurant(amrikSukhdev);

        return manager;
    }
}