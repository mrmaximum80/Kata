package javaCore.module2;

public class DoubleExpression {

    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs(c - (a + b)) <= 0.0001d);
    }
}
