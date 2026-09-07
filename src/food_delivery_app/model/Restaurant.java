package food_delivery_app.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private List<MenuItem> items = new ArrayList<>();
    private String address;

    public Restaurant() {
    }

    public Restaurant(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.items = new ArrayList<>();
    }

    public Restaurant(int id, String name, List<MenuItem> items, String address) {
        this.id = id;
        this.name = name;
        this.items = (items != null) ? new ArrayList<>(items) : new ArrayList<>();
        this.address = address;
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

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addItem(MenuItem menuItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(menuItem);
    }

    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}