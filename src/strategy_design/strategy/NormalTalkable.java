package strategy_design.strategy;

public class NormalTalkable implements Talkable {
    @Override
    public void talk() {
        System.out.println("Can talk");
    }
}
