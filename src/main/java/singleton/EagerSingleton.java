package singleton;

/**
 * JVM 加载类时就实例化对象
 * 问题：失去了延迟实例化的有点
 * Created by lx on 16/5/6.
 */
public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();
    private EagerSingleton() {}

    public static EagerSingleton getUniqueInstance() {
        return uniqueInstance;
    }
}
