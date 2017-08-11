package prototype.pattern;

/**
 * Created by lijialiang on 2017/8/11.
 */
public class Circle extends Shape {

    public Student studentInstance = new Student(20,"fff");

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
