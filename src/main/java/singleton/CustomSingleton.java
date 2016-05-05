package singleton;

/**
 * 经典实现，将构造函数声明为private，然后通过一个 static 方法 getUniqueInstance 来实例化
 * 仅在需要时才实例化，即实现了 “延迟实例化”，这对于资源敏感的对象很重要
 * 问题：用多线程时，可能会实例化多个对象出来.
 * Created by lx on 16/5/5.
 */
public class CustomSingleton {
    private static CustomSingleton uniqueInstance;

    private CustomSingleton() {}

    public static CustomSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CustomSingleton();
        }
        return uniqueInstance;
    }
}
