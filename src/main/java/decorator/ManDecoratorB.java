package decorator;

/**
 * 装饰类B
 * @author zhou
 */
public class ManDecoratorB extends Decorator{
    @Override
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("B");
    }
}
