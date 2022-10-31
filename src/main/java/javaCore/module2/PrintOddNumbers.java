package javaCore.module2;

public class PrintOddNumbers {

    public static void main(String[] args) {
        int[] arr  = {3,-5,20,8,7,3,100};
        printOddNumbers(arr);
    }
    public static void printOddNumbers(int[] arr) {
        if (arr != null) {
            String s = "";
            for (int ar : arr) {
                if (ar % 2 != 0) {
                    System.out.print(s + ar);
                    s = ",";
                }
            }
        }
        System.out.println("");
    }
}
