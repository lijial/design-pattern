package abstractt.factory.pattern;

/**
 * Created by lijialiang on 2017/7/25.
 */
public class ColorFactory extends AbstractFactory {

    Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType) {
        if(colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if(colorType.equalsIgnoreCase("green")) {
            return new Green();
        } else if(colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }
}
