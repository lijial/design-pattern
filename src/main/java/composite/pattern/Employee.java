package composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * subordinates 下属
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
   这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
   我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。
 * http://www.runoob.com/design-pattern/composite-pattern.html
 * Created by lijialiang on 2017/8/13.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;//组合模式就是拥有一个外层对象自己拥有一个自己的list
                                //因为是相似对象的集合

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
