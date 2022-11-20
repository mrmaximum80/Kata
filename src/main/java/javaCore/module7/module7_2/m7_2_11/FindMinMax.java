package javaCore.module7.module7_2.m7_2_11;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMinMax {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(3, 6, 1, -3, 18, 2);

        Comparator<Integer> integerComparator = (x, y) -> x - y;

        BiConsumer<Integer, Integer> consumer = (x, y) -> {
            System.out.println(x + " " + y);
        };


        FindMinMax a = new FindMinMax();
        a.findMinMax(stream, integerComparator, consumer);
    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        Object[] result = stream.collect(Collectors.teeing(Collectors.minBy(order),
                Collectors.maxBy(order), (min, max) -> {
                    return new Object[] {min.orElse(null),max.orElse(null)};
                }));

        minMaxConsumer.accept((T) result[0], (T) result[1]);
    }
}
