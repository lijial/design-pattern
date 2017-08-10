package build.pattern;

/**
 * Pepsi 百事可乐
 * Created by lijialiang on 2017/8/10.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
