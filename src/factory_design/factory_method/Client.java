package factory_design.factory_method;

public class Client {
    public static void main(String[] args) {
        BurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
        Burger simple = simpleBurgerFactory.createBurger("simple");
        simple.prepare();
    }
}
