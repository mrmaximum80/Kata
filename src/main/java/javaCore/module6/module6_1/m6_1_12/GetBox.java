package javaCore.module6.module6_1.m6_1_12;

import java.util.Optional;

public class GetBox {

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }
}
