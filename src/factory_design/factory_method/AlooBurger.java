package factory_design.factory_method;

public class AlooBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Aloo Burger");
    }
}
