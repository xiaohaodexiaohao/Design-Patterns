package simpleFactory;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1() + getNumber2();
        return result;
    }
}
