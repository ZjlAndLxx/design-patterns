package bridge;

/**
 * 笔（抽象类）
 * @author zhoujl
 */
public abstract class Pen {
    protected Color color;

    /**
     * 绘制方法
     * @param name
     */
    public abstract void draw(String name);

    public void setColor(Color color) {
        this.color = color;
    }
}
