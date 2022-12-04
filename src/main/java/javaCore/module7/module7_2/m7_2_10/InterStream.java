package javaCore.module7.module7_2.m7_2_10;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterStream {

    public static void main(String[] args) {
        pseudoRandomStream(13);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n) / 10 % 1000);
    }
}
