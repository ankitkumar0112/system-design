package food_delivery_app.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public Cart() {
    }

    private final List<Menu> items = new ArrayList<>();

    public void addItem(Menu item) {
        items.add(item);
    }

    public void removeItem(Menu item) {
        items.remove(item);
    }

    public void clear() {
        items.clear();
    }

    public double getTotal(int id) {
        return items.stream().mapToDouble(Menu::getPrice).sum();
    }
}
