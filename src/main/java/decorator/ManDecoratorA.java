package decorator;

/**
 * 装饰类A
 * @author zhoujl
 */
public class ManDecoratorA extends Decorator{
    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("A");
    }
    public void reEat(){
        System.out.println("再吃一顿饭");
    }
}
