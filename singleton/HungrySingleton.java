package singleton;

/**
 * 饿汉式单例(调用及立即加载不存在多线程问题，但效率较低)
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
