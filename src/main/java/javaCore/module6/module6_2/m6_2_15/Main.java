package javaCore.module6.module6_2.m6_2_15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> euqed = new LinkedList<>();


        while (scanner.hasNext()) {
            deque.addLast(scanner.nextInt());
        }

        int size = deque.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                deque.removeFirst();
            } else {
                euqed.addFirst(deque.removeFirst());
            }
        }
        for (int euq : euqed) {
            System.out.print(euq + " ");

        }
    }
}

