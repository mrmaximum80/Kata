package javaCore.module2;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
