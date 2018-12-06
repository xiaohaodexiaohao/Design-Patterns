package simpleFactory;

import java.util.Scanner;

/**
 * 简单工厂模式实现计算器功能
 *
 */
public class Client {
    public static void main(String[] args) {
        Operation oper;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入操作的两个数字：");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        System.out.println(("请输入运算符："));
        String operator = scan.next();
        oper = OperationFactory.createOperate(operator);
        oper.setNumber1(number1);
        oper.setNumber2(number2);
        System.out.println("结果为："+oper.getResult());
    }
}


