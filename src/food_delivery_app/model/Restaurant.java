package food_delivery_app.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private List<Menu> items = new ArrayList<>();
    private String address;

    public Restaurant(int id, String name, List<Menu> items, String address) {
        this.id = id;
        this.name = name;
        this.items = items;
        this.address = address;
    }

    public Restaurant() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getItems() {
        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addItems(Menu menu) {
        items.add(menu);
    }
}
