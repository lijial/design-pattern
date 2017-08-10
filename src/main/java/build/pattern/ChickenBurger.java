package build.pattern;

/**
 * Created by lijialiang on 2017/8/10.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
