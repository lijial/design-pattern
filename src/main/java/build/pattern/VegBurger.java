package build.pattern;

/**
 * Created by lijialiang on 2017/8/10.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
