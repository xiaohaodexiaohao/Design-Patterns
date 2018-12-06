package singleton;
/**
 * 懒汉式单例（比较懒只有在调用方法时实例化对象，存在多线程问题，但效率比较高）
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){};
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
