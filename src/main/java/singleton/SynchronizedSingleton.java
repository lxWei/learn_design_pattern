package singleton;

/**
 * CustomSingleton 不是线程安全的
 * 本例通过给 getUniqueInstance 添加关键字 synchronized，迫使每个线程在进入该方法时，都要先等候其它线程离开
 * 问题：降低性能
 * Created by lx on 16/5/5.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
