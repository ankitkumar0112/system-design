package food_delivery_app.service;

import food_delivery_app.model.Menu;
import food_delivery_app.model.Restaurant;

import java.util.List;

public class RestaurantManager {
    List<Restaurant> restaurants;

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Restaurant searchByLocation(String location) {
        Menu menu1 = new Menu(1, "Kadhai Paneer", 240);
        Menu menu2 = new Menu(2, "Dal Makhani", 160);

        Restaurant restaurant1 = new Restaurant();
        restaurant1.addItems(menu1);
        restaurant1.addItems(menu2);

        Restaurant apniRasoi = new Restaurant(1, "Apni Rasoi", List.of(menu1, menu2), "Delhi");
        if (location.equals("Delhi")) {
            return apniRasoi;
        }
        return null;
    }
}
