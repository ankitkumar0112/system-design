package solidprinciples.srp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void calculateTotalPrice() {
        double totalPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("Total price is " + totalPrice);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
