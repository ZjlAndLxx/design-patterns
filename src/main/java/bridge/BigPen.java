package bridge;

/**
 * 大号笔
 * @author zhoujl
 */
public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "大号笔绘制";
        this.color.bePaint(penType,name);
    }
}
