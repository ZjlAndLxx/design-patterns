package bridge;

/**
 * 红色，颜色的实现类
 * @author zhoujl
 */
public class Red implements Color{
    public void bePaint(String penType, String name) {
        System.out.println(penType+"红色的"+name+".");
    }
}
