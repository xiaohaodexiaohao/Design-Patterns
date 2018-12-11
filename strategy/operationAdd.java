package strategy;

/**
 * 实现接口的Add实体类
 */
public class operationAdd implements strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
