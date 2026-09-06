package food_delivery_app.order;

import food_delivery_app.model.Menu;

import java.util.List;

public interface Order {
    void order(List<Menu> items);
}
