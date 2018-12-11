package strategy;
/**
 * 实现接口的实体类
 */
public class operationSub implements strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
