package javaCore.module2;

public class Concat {

    public static void main(String[] args) {
        System.out.println('A' + "12");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println((int) 'A');
        System.out.println((int) '1');
        System.out.println('1');
        System.out.println('A' + '1');
        System.out.println('A' + '1' + "2");

        int a = 322;
        byte b = (byte) a;
        byte c = (byte) 0b01000010;
        System.out.println(b);
        System.out.println(c);

        a = -5;
        b = (byte) a;
        System.out.println(b);
    }
}
