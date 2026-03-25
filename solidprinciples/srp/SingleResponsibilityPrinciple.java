package solidprinciples.srp;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 40000);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        InvoicePrinter invoicePrinter = new InvoicePrinter(shoppingCart);
        DbStorage db = new DbStorage(shoppingCart);

        invoicePrinter.printInvoice();
        shoppingCart.calculateTotalPrice();
        db.store();
    }
}
