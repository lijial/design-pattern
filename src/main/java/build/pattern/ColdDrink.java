package build.pattern;

/**
 * Created by lijialiang on 2017/8/10.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
