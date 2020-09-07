package singleton;

/**
 * 双重加锁懒汉式单例（线程安全）
 * @author zhoujl
 */
public class DoubleLockLazyManSingleton {
    private static volatile DoubleLockLazyManSingleton instance;
    private DoubleLockLazyManSingleton(){}

    public static DoubleLockLazyManSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleLockLazyManSingleton.class){
                if (instance  == null){
                    instance = new DoubleLockLazyManSingleton();
                }
            }
        }
        return instance;
    }
}
