package singleton;

/**
 * 懒汉式单例（线程不安全，未加锁）
 * @author zhoujl
 */
public class LazyManSingleton {
    private static LazyManSingleton instance;
    private LazyManSingleton(){}

    public static LazyManSingleton getInstance(){
        if (instance == null){
            instance = new LazyManSingleton();
        }
        return instance;
    }
}
