package prototype.pattern;

/**
 * 原型模型
 * 何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。
 * 2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 * 3、为了避免创建一个与产品类层次平行的工厂类层次时。
 * 4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 * 注意事项:与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流（在circle类中写student类，发现可以通过clone()得到student对象，所以这里说的clone 是浅拷贝，不认同）。
 * Created by lijialiang on 2017/8/11.
 */
public class PrototypePatternMain {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
