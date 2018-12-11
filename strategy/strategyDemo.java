package strategy;

/**
 * 客户端
 */
public class strategyDemo {
    public static void main(String[] args) {
        context addCont = new context(new operationAdd());
        System.out.println(addCont.executeStrategy(1, 3));

        context subCont = new context(new operationSub());
        System.out.println(subCont.executeStrategy(9, 122));

        context mulCont = new context(new operationMul());
        System.out.println(mulCont.executeStrategy(8, 9));


    }
}
