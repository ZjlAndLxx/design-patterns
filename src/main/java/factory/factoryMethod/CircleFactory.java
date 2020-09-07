package factory.factoryMethod;

import factory.simpleFactory.Circle;
import factory.simpleFactory.Shape;

/**
 * 圆形工厂
 */
public class CircleFactory implements Factory {

    public Shape getShape() {
        return new Circle();
    }
}
