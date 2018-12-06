package adapter;
/**
 * 客户端调用目标方法
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
    }
}
