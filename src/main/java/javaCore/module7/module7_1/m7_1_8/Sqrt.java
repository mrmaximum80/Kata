package javaCore.module7.module7_1.m7_1_8;

import java.util.function.UnaryOperator;

public class Sqrt {

    public UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}
