package abstractt.factory.pattern;

/**
 * 工厂生成器类
 * Created by lijialiang on 2017/7/25.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if(factoryType.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
