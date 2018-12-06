package responsibility;

/**
 * 具体的实现类
 * 处理0到10的请求，否则转到下一位
 */
public class ConcreteHandler1 extends Handler{
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
