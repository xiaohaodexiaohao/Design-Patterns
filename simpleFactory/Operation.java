package simpleFactory;

/**
 * 运算父类
 */
public class Operation {
    private double number1 = 0;
    private double number2 = 0;

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getResult(){
        double result = 0;
        return result;
    }

}
