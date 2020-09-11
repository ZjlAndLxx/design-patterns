package bridge;

/**
 * 中号笔
 * @author zhoujl
 */
public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "中号笔绘制";
        this.color.bePaint(penType,name);
    }
}
