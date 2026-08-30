package strategy_design.strategy;

public class NonWalkable implements Walkable {
    @Override
    public void walk() {
        System.out.println("Cannot walk");
    }
}
