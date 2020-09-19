package decorator;

/**
 * 测试装饰类使用效果，无实际意义
 * @author zhoujl
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA  manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();
        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
    }
}
