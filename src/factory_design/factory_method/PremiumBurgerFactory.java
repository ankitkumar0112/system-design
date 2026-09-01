package factory_design.factory_method;

public class PremiumBurgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if ("wheat".equalsIgnoreCase(type)) {
            return new WheatBurger();
        } else if ("oats".equalsIgnoreCase(type)) {
            return new OatsBurger();
        } else {
            System.out.println("Invalid burger type");
            return null;
        }
    }
}
