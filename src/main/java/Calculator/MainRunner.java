package Calculator;

import java.util.Scanner;

public class MainRunner {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите выражение для вычисления или 0 для завершения...");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("0")) break;
            System.out.println(Main.calc(input));
        }
    }
}
