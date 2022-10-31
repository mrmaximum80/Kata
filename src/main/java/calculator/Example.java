package calculator;

import java.util.Scanner;

public class Example {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X:");
        int x = scanner.nextInt();
        System.out.println("Введите Y:");
        int y = scanner.nextInt();

        System.out.println("X+Y=" + sum(x, y));
    }
}
