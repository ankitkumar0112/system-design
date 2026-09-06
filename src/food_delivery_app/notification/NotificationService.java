package food_delivery_app.notification;

import food_delivery_app.order.Order;

public interface NotificationService {
    void notifyUser(Order id);
}
