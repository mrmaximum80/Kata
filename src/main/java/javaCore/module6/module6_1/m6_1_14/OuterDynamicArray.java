package javaCore.module6.module6_1.m6_1_14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OuterDynamicArray {

    public static void main(String[] args) {

        String[] str = new String[] {"as", "df", "lf"};
        DynamicArray<String> array = new DynamicArray<>();

        array.add("joke");
        array.add("2");
        array.add("zx");
        array.remove(1);
        array.add("we");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

    }

    public static class DynamicArray<T> {

        private int capacity = 10;
        private T[] array;
        private int size = -1;

        public DynamicArray() {
            array = (T[]) new Object[capacity];
        }

        public void add(T el) {
            size++;
            if (size == capacity) {
                capacity = (int) (capacity * 1.5);
                Arrays.copyOf(array, capacity);
            }
            array[size] = el;
        }

        public T get(int index) {
            if (index > size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return array[index];
        }

        public void remove(int index) {
            if (index > size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (size > 0 && index != size) {
                System.arraycopy(array, index + 1, array, index, size - index);
//                for (int i = index; i < size; i++) {
//                    array[i] = array[i + 1];
//                }
            }
            array[size] = null;
            size--;
        }
    }
}