package strategy;

/**
 * Created by lx on 16/5/5.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
