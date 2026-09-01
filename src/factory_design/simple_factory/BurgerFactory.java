package factory_design.simple_factory;

public class BurgerFactory {
    public Burger createBurger(String type) {
        if ("simple".equalsIgnoreCase(type)) {
            return new SimpleBurger();
        } else if ("premium".equalsIgnoreCase(type)) {
            return new PremiumBurger();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger simpleBurger = burgerFactory.createBurger("simple");
        simpleBurger.prepare();

        Burger premiumBurger = burgerFactory.createBurger("premium");
        premiumBurger.prepare();

    }
}
