package food_delivery_app.service;

import food_delivery_app.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    List<Restaurant> restaurants = new ArrayList<>();

    private RestaurantManager() {

    }

    private static final RestaurantManager INSTANCE = new RestaurantManager();

    public static RestaurantManager getInstance() {
        return INSTANCE;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String location) {
        if (restaurants.isEmpty()) {
            return new ArrayList<>();
        } else {
            return restaurants.stream()
                    .filter(restaurant -> location.equalsIgnoreCase(restaurant.getAddress()))
                    .toList();
        }
    }
}
