package srp;

import java.util.List;

public class InvoicePrinter {
    ShoppingCart shoppingCart;

    public InvoicePrinter(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void printInvoice() {
        List<Product> products = shoppingCart.products;
        System.out.println("Invoice");
        for (Product p : products) {
            System.out.println("Product name : " + p.getProductName() + ", Price : " + p.getPrice());
        }
    }
}
