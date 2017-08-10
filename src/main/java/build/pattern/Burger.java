package build.pattern;

/**
 * Created by lijialiang on 2017/8/10.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
