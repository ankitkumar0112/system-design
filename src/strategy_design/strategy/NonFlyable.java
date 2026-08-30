package strategy_design.strategy;

public class NonFlyable implements Flyable {

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
