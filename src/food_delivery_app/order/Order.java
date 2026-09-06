package food_delivery_app.order;

import food_delivery_app.model.MenuItem;
import food_delivery_app.model.OrderStatus;
import food_delivery_app.model.Restaurant;
import food_delivery_app.model.User;

import java.util.List;

public interface Order {
    String getOrderId();

    User getUser();

    Restaurant getRestaurant();

    List<MenuItem> getItems();

    OrderStatus getStatus();

    void setStatus(OrderStatus status);

    double getTotal();

    void placeOrder();
}