package factory.pattern;

/**
 * 工厂模式
 * Created by lijialiang on 2017/7/25.
 *
 */
public class FactoryPatternMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //draw a circle
        Shape shape_circle = shapeFactory.getShape("circle");
        shape_circle.draw();

        //draw a circle
        Shape shape_square = shapeFactory.getShape("square");
        shape_square.draw();

        //draw a circle
        Shape shape_rectangle = shapeFactory.getShape("rectangle");
        shape_rectangle.draw();
    }
}
