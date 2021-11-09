package classwork.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.plus(3, 7);
        System.out.println(result);

        result = calculator.minus(10, 7);
        System.out.println(result);

        long l = calculator.multiply(6, 4);
        System.out.println(l);

        double d = calculator.divide(10, 5);
        System.out.println(d);
    }
}
