package factory_design.simple_factory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger");
    }
}
