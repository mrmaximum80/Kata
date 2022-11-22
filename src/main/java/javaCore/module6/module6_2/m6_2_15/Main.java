package javaCore.module6.module6_2.m6_2_15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> euqed = new LinkedList<>();
//        for (int i = 1; i <13; i++){
//            deque.addLast(i);
//        }


        while (scanner.hasNext()) {
            deque.addLast(scanner.nextInt());
        }

//        int size = deque.size();
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            if (iterator.hasNext()){
                iterator.next();
            }
        }
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                deque.removeFirst();
//                deque.remove(i);
//            } else {
//                euqed.addFirst(deque.removeFirst());
//            }
//        }
//        for (int dec : deque) {
//            System.out.print(dec + " ");
//        }

        System.out.println();
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            System.out.print(deque.pollLast() + " ");
        }
    }
}

