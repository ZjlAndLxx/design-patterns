package bridge;

/**
 * 白色，color的实现类
 * @author zhoujl
 */
public class White implements Color{
    public void bePaint(String penType, String name) {
        System.out.println(penType+"白色的"+name+".");
    }
}
