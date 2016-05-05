package strategy;

/**
 * Created by lx on 16/5/5.
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can not fly!!!");
    }
}
