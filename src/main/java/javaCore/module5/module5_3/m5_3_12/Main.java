package javaCore.module5.module5_3.m5_3_12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", sum);
    }
}
