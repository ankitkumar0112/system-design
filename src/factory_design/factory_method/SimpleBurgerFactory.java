package factory_design.factory_method;

public class SimpleBurgerFactory implements  BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if ("simple".equalsIgnoreCase(type)) {
            return new SimpleBurger();
        } else if ("oats".equalsIgnoreCase(type)) {
            return new OatsBurger();
        } else {
            System.out.println("Invalid burger type");
            return null;
        }
    }
}
