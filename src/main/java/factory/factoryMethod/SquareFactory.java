package factory.factoryMethod;

import factory.simpleFactory.Shape;
import factory.simpleFactory.Square;

/**
 * 正方形工厂
 * @author zhoujl
 */
public class SquareFactory implements Factory {
    public Shape getShape() {
        return new Square();
    }
}
