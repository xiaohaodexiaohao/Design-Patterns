package simpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1()/getNumber2();
        return result;
    }
}
