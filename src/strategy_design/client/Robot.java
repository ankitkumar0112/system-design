package strategy_design.client;

import strategy_design.strategy.Flyable;
import strategy_design.strategy.Talkable;
import strategy_design.strategy.Walkable;

public class Robot {
    private final Talkable talkable;
    private final Walkable walkable;
    private final Flyable flyable;

    public Robot(Talkable talkable, Walkable walkable, Flyable flyable) {
        this.talkable = talkable;
        this.walkable = walkable;
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }

    public void walk() {
        walkable.walk();
    }

    public void talk() {
        talkable.talk();
    }
}
