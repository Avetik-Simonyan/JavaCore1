package classwork;

import Homework.Calc;
import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();
        //System.out.println("Sum = " + (a + b));

        System.out.println("please input operation (+, -, /, *)");
        String operation = scanner.next();
        Calc calc = new Calc();

        switch (operation) {
            case "+":
                System.out.println(calc.plus(a, b));
                break;
            case "-":
                System.out.println(calc.minus(a, b));
                break;
            case "*":
                System.out.println(calc.multiple(a, b));
                break;
            case "/":
                System.out.println(calc.devide(a, b));
                break;
            default:
                System.out.println("Invalid operation");

        }

    }

}
