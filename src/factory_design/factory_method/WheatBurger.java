package factory_design.factory_method;

public class WheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing wheat burger");
    }
}
