package food_delivery_app.order;

import food_delivery_app.model.MenuItem;
import food_delivery_app.model.OrderStatus;
import food_delivery_app.model.Restaurant;
import food_delivery_app.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeliveryOrder implements Order {
    private final String orderId;
    private final User user;
    private final Restaurant restaurant;
    private final List<MenuItem> items;
    private final String deliveryAddress;
    private final double deliveryFee;
    private OrderStatus status;

    public DeliveryOrder(String orderId, User user, Restaurant restaurant, List<MenuItem> items, String deliveryAddress, double deliveryFee) {
        this.orderId = orderId;
        this.user = user;
        this.restaurant = restaurant;
        this.items = new ArrayList<>(items);
        this.deliveryAddress = deliveryAddress;
        this.deliveryFee = deliveryFee;
        this.status = OrderStatus.CREATED;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public List<MenuItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public double getTotal() {
        double subtotal = items.stream().mapToDouble(MenuItem::getPrice).sum();
        return subtotal + deliveryFee;
    }

    @Override
    public void placeOrder() {
        this.status = OrderStatus.PAID;
        System.out.printf("Delivery Order [%s] placed for %s to '%s'. Total: ₹%.2f%n",
                orderId, user.getName(), deliveryAddress, getTotal());
    }
}