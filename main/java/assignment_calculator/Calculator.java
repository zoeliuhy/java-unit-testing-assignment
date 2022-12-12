package assignment_calculator;

public class Calculator {


    public static void main(String[] args) {
    }

    static double printMultiplyResult(double num1, double num2) {
        return num1 * num2;
    }

    public double printDivideResult(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    public double printSumResult(double num1, double num2) {
        return num1 + num2;
    }

    public double printSubtractResult(double num1, double num2) {
        return num1 - num2;
    }
}
