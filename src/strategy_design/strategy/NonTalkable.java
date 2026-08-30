package strategy_design.strategy;

public class NonTalkable implements Talkable {
    @Override
    public void talk() {
        System.out.println("Cannot talk");
    }
}
