package factory_design.simple_factory;

public class SimpleBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Simple Burger");
    }
}
