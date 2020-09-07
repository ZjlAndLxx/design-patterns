package singleton;

/**
 * 利用内部静态类实现单例（线程安全）
 * @author zhoujl
 */
public class StaticClassLazyManSingleton {
    private static class SingletonHolder{
        private  static final StaticClassLazyManSingleton INSTANCE = new StaticClassLazyManSingleton();
    }
    private StaticClassLazyManSingleton(){

    }
    public static final StaticClassLazyManSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
