package prototype;

/**
 * 测试原型设计模式
 * @author zhoujl
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');


        manager.register("Strong message",underLinePen);
        manager.register("Waring Box",messageBox);
        manager.register("Slash Box",sBox);

        Product p1 = manager.create("Strong message");
        p1.use("Hello world");

        Product p2 = manager.create("Waring Box");
        p2.use("Hello world");

        Product p3 = manager.create("Slash Box");
        p3.use("Hello World");

        Product p4= sBox.creatClone();
        p4.use("Hello World");

    }
}
