package factory.simpleFactory;

/**
 * Square
 * @author zhoujl
 */
public class Square implements Shape {

    public Square(){
        System.out.println("Square");
    }
    public void draw() {
        System.out.println("Draw square");
    }
}
