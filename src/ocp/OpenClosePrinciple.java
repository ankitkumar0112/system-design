package ocp;

public class OpenClosePrinciple {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 40000);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        InvoicePrinter invoicePrinter = new InvoicePrinter(shoppingCart);
        invoicePrinter.printInvoice();
        shoppingCart.calculateTotalPrice();
        Persistence saveToDb = new DbPersistence();
        saveToDb.save();
        Persistence saveToFile = new FilePersistence();
        saveToFile.save();
    }
}
