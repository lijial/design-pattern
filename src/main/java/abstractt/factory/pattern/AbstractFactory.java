package abstractt.factory.pattern;

/**
 * Created by lijialiang on 2017/7/25.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
