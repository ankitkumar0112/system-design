package food_delivery_app;

import food_delivery_app.model.Restaurant;
import food_delivery_app.model.User;
import food_delivery_app.service.CartService;
import food_delivery_app.service.RestaurantManager;

public class FoodDeliveryApp {
    private final User user;
    private final RestaurantManager manager;
    private final Restaurant restaurant;
    private final CartService cartService;

    public FoodDeliveryApp(User user, RestaurantManager manager, Restaurant restaurant, CartService cartService) {
        this.user = user;
        this.manager = manager;
        this.restaurant = restaurant;
        this.cartService = cartService;
    }

    public static void main(String[] args) {
        User u = new User(1, "John Doe", "9999999999");
        RestaurantManager restaurantManager = new RestaurantManager();
        Restaurant searchByLocation = restaurantManager.searchByLocation("Delhi");
        CartService service = new CartService();
        searchByLocation.getItems().forEach(service::addItem);
        FoodDeliveryApp foodDeliveryApp = new FoodDeliveryApp(u, restaurantManager, searchByLocation, service);
    }
}
