package lessen13;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(6, 8);
        FractionNumberImpl number2 = new FractionNumberImpl(5, 9);
        System.out.println(number1);
        System.out.println(number2);
        FractionNumberOperationImpl utils = new FractionNumberOperationImpl();
        FractionNumber result = utils.add(number1, number2);
        System.out.println(result);
        FractionNumberOperationImpl second = new FractionNumberOperationImpl();
        FractionNumber difference = second.sub(number1, number2);
        System.out.println(difference);
        FractionNumberOperationImpl third = new FractionNumberOperationImpl();
        FractionNumber total = third.mul(number1, number2);
        System.out.println(total);
        FractionNumberOperationImpl fourth = new FractionNumberOperationImpl();
        FractionNumber itog = third.div(number1, number2);
        System.out.println(itog);
    }
}
