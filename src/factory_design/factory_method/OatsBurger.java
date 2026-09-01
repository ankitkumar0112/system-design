package factory_design.factory_method;

public class OatsBurger implements  Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing oats burger");
    }
}
