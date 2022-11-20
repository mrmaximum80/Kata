package javaCore.module4.module4_1;

public class DiffTypes {

    public static void main(String[] args) {

        Object i = Integer.valueOf(42);
        String s = (String)i;
    }
}

class A {
    int i;
}

class B extends A {
    final String str = "Hello";
}