package factory.simpleFactory;

import com.sun.istack.internal.NotNull;

/**
 * 多边形工厂
 * @author zhoujl
 */
public class ShapeFactory {
    private static final String CIRCLE="CIRCLE";
    private static final String RECTANGLE="RECTANGLE";
    private static final String SQUARE="SQUARE";
    public static Shape getShape(@NotNull String shapeType){
        if (CIRCLE.equals(shapeType)){
            return new Circle();
        }
        if (RECTANGLE.equals(shapeType)){
            return new Rectangle();
        }
        if (SQUARE.equals(shapeType)){
            return new Square();
        }
        return null;
    }
}
