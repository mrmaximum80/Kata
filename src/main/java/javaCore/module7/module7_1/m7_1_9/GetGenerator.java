package javaCore.module7.module7_1.m7_1_9;

public class GetGenerator {

    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;

    }
}
