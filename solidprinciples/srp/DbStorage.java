package solidprinciples.srp;

public class DbStorage {
    ShoppingCart shoppingCart;

    public DbStorage(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void store() {
        System.out.println("Stored to DB successfully");
    }
}
