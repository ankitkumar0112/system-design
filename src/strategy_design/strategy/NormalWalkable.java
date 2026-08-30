package strategy_design.strategy;

public class NormalWalkable implements Walkable {
    @Override
    public void walk() {
        System.out.println("Can walk");
    }
}
