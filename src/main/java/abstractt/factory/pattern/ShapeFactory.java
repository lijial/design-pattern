package abstractt.factory.pattern;

/**
 * Created by lijialiang on 2017/7/25.
 */
public class ShapeFactory extends AbstractFactory {

    Color getColor(String colorType) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
