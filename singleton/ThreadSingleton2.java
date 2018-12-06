package singleton;

/**
 * 双重锁机制提高效率 ,
 * 通过二次判断，这样的话就不用每次都执行同步代码块，这样的话，只需第一次执行的时候比较占资源，以后的话就和之前的一样了
 */
public class ThreadSingleton2 {
    private static ThreadSingleton2 threadSingleton2;
    private ThreadSingleton2(){}
    public static ThreadSingleton2 getInstance(){
        if(threadSingleton2 == null){
            synchronized(ThreadSingleton2.class){
                if(threadSingleton2 == null){
                    threadSingleton2 = new ThreadSingleton2();
                }
                return threadSingleton2;
            }
        }
        return threadSingleton2;
    }
}
/*
考虑并发的话需要加volatile关键字

14行这个new操作是无序的，它可能会被编译成：
- a. 先分配内存，让instance指向这块内存
- b. 在内存中创建对象

然而我们需要意识到这么一个问题，
synchronized虽然是互斥的，但不代表一次就把整个过程执行完，它在中间是可能释放时间片的，时间片不是锁。
也就是说可能在a执行完后，时间片被释放，线程2执行到1，这时他读到的instance是不是null呢？
基于可见性，可能是null，也可能不是null。
在这个例子中，如果读到的是null，反而没问题了，接下来会等待锁，然后再次判断时不为null，最后返回单例。
如果读到的不是null，按逻辑它就直接return instance了，这个instance还没执行构造参数，去做事情的话，很可能就崩溃了。

 */