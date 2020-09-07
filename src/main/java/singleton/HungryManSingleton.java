package singleton;

/**
 * 饿汉式单例模式（线程安全）
 * @author zhoujl
 *
 */
public class HungryManSingleton {
    private final static  HungryManSingleton INSTENCE = new HungryManSingleton();
    private HungryManSingleton(){}
    public static HungryManSingleton singletonInstence(){
        return INSTENCE;
    }
}
