package javaCore.module7.module7_1.m7_1_10;

import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        Function<T, U> result = t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
        return result;
    }
}
