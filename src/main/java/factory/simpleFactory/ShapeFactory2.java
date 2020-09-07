package factory.simpleFactory;

/**
 * 使用反射机制改善简单工厂
 * @author zhoujl
 */
public class ShapeFactory2 {
    public static void main(String[] args) {
        Shape o = ShapeFactory2.gerClass(Circle.class);
        o.draw();
    }
    public static Shape gerClass(Class<? extends Shape> clazz){
       Object obj = null;
       try {
           obj = Class.forName(clazz.getName()).newInstance();
       }catch (ClassNotFoundException e){
            e.printStackTrace();
       }catch (InstantiationException e){
            e.printStackTrace();
       }catch (IllegalAccessException e){
            e.printStackTrace();
       }
       return (Shape)obj;
    }
}
