package decorator;

/**
 * Created by lx on 16/5/12.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 9.99;
    }
}
