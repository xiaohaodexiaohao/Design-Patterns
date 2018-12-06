package simpleFactory;

/**
 * 运算工厂类
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation opera = null;
        switch (operate){
            case "+":
                opera = new OperationAdd();
                break;
            case "-":
                opera = new OperationSub();
                break;
            case "*":
                opera = new OperationMul();
                break;
            case "/":
                opera = new OperationSub();
                break;
        }
        return opera;
    }
}
