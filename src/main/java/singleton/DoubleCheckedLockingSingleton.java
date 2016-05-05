package singleton;

/**
 * 使用双重检查加锁
 * 1. 实现延迟实例化
 * 2. 线程安全
 * 3. 性能无损
 * Created by lx on 16/5/6.
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {};

    public static DoubleCheckedLockingSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
