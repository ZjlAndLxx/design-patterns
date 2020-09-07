package factory.simpleFactory;

/**
 * 圆形
 * @author zhoujl
 */
public class Circle implements Shape{
    public Circle(){
        System.out.println("圆形");
    }
    public void draw() {
        System.out.println("画一个圆形");
    }
}
