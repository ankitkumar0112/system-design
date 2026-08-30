package strategy_design.strategy;

public class NormalFlyable implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
