package build.pattern;

/**
 * Created by lijialiang on 2017/8/10.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
