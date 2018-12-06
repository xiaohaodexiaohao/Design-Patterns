package responsibility;

/**
 * 客户端代码
 */
public class Client {
    public static void main(String[] args) {

        Handler handlerA = new ConcreteHandler1();
        Handler handlerB = new ConcreteHandler2();
        Handler handlerC = new ConcreteHandler3();

        //设置责任链的下一家
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2,5,14,22,18,27,20};
        for (int request : requests) {
            handlerA.handleRequest(request);
        }

    }
}
