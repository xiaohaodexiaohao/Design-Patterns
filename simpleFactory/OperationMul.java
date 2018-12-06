package simpleFactory;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1() * getNumber2();
        return result;
    }
}
