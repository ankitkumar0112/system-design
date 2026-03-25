package solidprinciples.srp;

import java.util.ArrayList;
import java.util.List;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000));
        products.add(new Product("Television", 30000));
        ShoppingCart shoppingCart = new ShoppingCart(products);
        InvoicePrinter invoicePrinter = new InvoicePrinter(shoppingCart);
        DbStorage db = new DbStorage(shoppingCart);

        invoicePrinter.printInvoice();
        shoppingCart.calculateTotalPrice();
        db.store();
    }
}
