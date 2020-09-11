package bridge;

/**
 * 小号笔
 * @author zhoujl
 */
public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType = "小号笔绘制";
        this.color.bePaint(penType,name);
    }
}
