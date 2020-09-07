package factory.factoryMethod;

import factory.simpleFactory.Rectangle;
import factory.simpleFactory.Shape;

/**
 * 长方形工厂
 * @author zhoujl
 */
public class RectangleFactory implements Factory {
    public Shape getShape() {
        return new Rectangle();
    }
}
