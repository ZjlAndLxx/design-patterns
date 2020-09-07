package factory.simpleFactory;

/**
 * Rectangle
 * @author zhoujl
 */
public class Rectangle implements Shape {
    public Rectangle(){
        System.out.println("Rectangle");
    }
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
