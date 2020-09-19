package decorator;

/**
 * 具体被装饰对象
 * @author zhoujl
 */
public class Man implements Person{
    public void eat() {
        System.out.println("男人在吃");
    }
}
