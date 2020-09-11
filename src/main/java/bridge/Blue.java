package bridge;

/**
 *蓝色，颜色的实现类
 * @author zhoujl
 */
public class Blue implements Color {
    public void bePaint(String penType, String name) {
        System.out.println(penType + "蓝色的"+ name +".");
    }
}
