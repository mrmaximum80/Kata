package javaCore.module6.module6_1.m6_1_13;

import java.util.Objects;
import java.util.Optional;

public class OuterPair {

    public static class Pair<T, V> {

        private T first;
        private V second;

        private Pair(T t, V v) {
            first = t;
            second = v;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        public static <T, V> Pair<T, V> of(T t, V v) {
            return new Pair<>(t, v);
        }
    }
}
