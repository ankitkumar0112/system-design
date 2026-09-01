package factory_design.factory_method;

public class SimpleBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Simple Burger");
    }
}
