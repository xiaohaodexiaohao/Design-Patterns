package responsibility;

/**
 * 具体的实现类
 * 处理10到20的请求，否则转到下一位
 */
public class ConcreteHandler2 extends Handler{
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
