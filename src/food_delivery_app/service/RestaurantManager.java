package food_delivery_app.service;

import food_delivery_app.model.MenuItem;
import food_delivery_app.model.Restaurant;

import java.util.List;

public class RestaurantManager {
    List<Restaurant> restaurants;

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Restaurant searchByLocation(String location) {
        MenuItem menuItem1 = new MenuItem(1, "Kadhai Paneer", 240);
        MenuItem menuItem2 = new MenuItem(2, "Dal Makhani", 160);

        Restaurant restaurant1 = new Restaurant();
        restaurant1.addItem(menuItem1);
        restaurant1.addItem(menuItem2);

        Restaurant apniRasoi = new Restaurant(1, "Apni Rasoi", List.of(menuItem1, menuItem2), "Delhi");
        if (location.equals("Delhi")) {
            return apniRasoi;
        }
        return null;
    }
}
