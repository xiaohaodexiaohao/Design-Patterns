package singleton;

/**
 * 静态内部类实现单例
 */
public class StaticSingleton {
    private StaticSingleton() {}

    private static class SingletonInstance {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
