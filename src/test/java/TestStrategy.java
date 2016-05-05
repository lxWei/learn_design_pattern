import strategy.Duck;
import strategy.FlyNoWay;
import strategy.MallardDuck;
import strategy.MuteQuack;

/**
 * Created by lx on 16/5/5.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        
        mallard.performFly();
        mallard.performQuack();
    }
}
