package javaCore.module2;

import java.math.BigInteger;

public class FactRecurs {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        BigInteger fact = new BigInteger(String.valueOf(value));
        if  (value <= 1){
            return BigInteger.valueOf(1);
        } else {
            return fact.multiply(factorial(value - 1));
        }
    }
}
