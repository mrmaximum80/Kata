package javaCore.module7.module7_1.m7_1_9;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
