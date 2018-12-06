package singleton;

/**
 * 多线程时的单例(用synchronized同步方法)
 */
public class ThreadSingleton {
    private ThreadSingleton(){}
    private static ThreadSingleton threadSingleton = null;

    public static ThreadSingleton getInstance(){
        synchronized(ThreadSingleton.class){
            if(threadSingleton == null){
                threadSingleton = new ThreadSingleton();
            }
            return threadSingleton;
        }
    }
}
//缺点：每次调用方法都要使用同步锁