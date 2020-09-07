package singleton;

/**
 * 加了锁 线程安全的懒汉式单例
 */
public class SafetyLazyManSingleton {
    private static SafetyLazyManSingleton instance;
    private SafetyLazyManSingleton(){}

    public static synchronized SafetyLazyManSingleton getInstance(){
        if (instance == null){
            instance = new SafetyLazyManSingleton();
        }
        return instance;
    }
}
