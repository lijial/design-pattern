package singleton.pattern;

/**
 * 单例模式说的非常精彩，包含内部类，synchronized 关键字使用，lazy加载，线程安全知识
 * 参考：http://www.runoob.com/design-pattern/singleton-pattern.html
 * Created by lijialiang on 2017/7/25.
 */
public class SingletonPatternMain {

    public static void main(String[] args) {
        //wrong,private method
//        SingletonHungrySafeThird singleObject = new SingletonHungrySafeThird();

        SingletonLazyUnsafeFirst singletonLazyUnsafeFirst = SingletonLazyUnsafeFirst.getInstance();
        singletonLazyUnsafeFirst.showMessage();

        SingletonLazySafeSecond singletonLazySafeSecond = SingletonLazySafeSecond.getInstance();
        singletonLazySafeSecond.showMessage();

        SingletonHungrySafeThird singleObject = SingletonHungrySafeThird.getInstance();
        singleObject.showMessage();

        SingletonLazySafeDoubleCheckFourth singletonLazySafeDoubleCheckFourth = SingletonLazySafeDoubleCheckFourth.getInstance();
        singletonLazySafeDoubleCheckFourth.showMessage();

        SingletonLazySafeInnerClassFifth singletonLazySafeInnerClassFifth = SingletonLazySafeInnerClassFifth.getInstance();
        singletonLazySafeInnerClassFifth.showMessage();
    }
}
