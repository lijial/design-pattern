package abstractt.factory.pattern;

/**
 * 抽象工厂模式
 * Created by lijialiang on 2017/7/25.
 */
public class AbstractFactoryPatternMain {

    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();
        colorFactory.getColor("blue").fill();


        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("rectangle").draw();
    }

}
