package strategy_design.client;

import strategy_design.strategy.NonFlyable;
import strategy_design.strategy.NonWalkable;
import strategy_design.strategy.NormalTalkable;

public class Client {
    Robot robot;

    public Client(Robot robot) {
        this.robot = robot;
    }

    public static void main(String[] args) {
        NonFlyable nonFlyable = new NonFlyable();
        NonWalkable nonWalkable = new NonWalkable();
        NormalTalkable normalTalkable = new NormalTalkable();
        Robot robot = new Robot(normalTalkable, nonWalkable, nonFlyable);
        Client client = new Client(robot);
        client.robot.fly();
        client.robot.walk();
        client.robot.talk();
    }
}
