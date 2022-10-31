package javaCore.module2;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int value) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
