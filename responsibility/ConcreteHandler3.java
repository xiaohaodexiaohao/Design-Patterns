package responsibility;

/**
 * 具体的实现类
 * 处理20以上的请求
 */
public class ConcreteHandler3 extends Handler {
    public void handleRequest(int request) {
        if(request>=20){
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if(successor!=null){
            successor.handleRequest(request);
        }
    }
}
