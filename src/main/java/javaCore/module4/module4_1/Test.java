package javaCore.module4.module4_1;

import java.io.PrintStream;

public class Test {

        public static void main(String[] args) {
            System.out.println(getCallerClassAndMethodName());
            m1();    }

        static void m1() {
            System.out.println(getCallerClassAndMethodName());
            m2();    }

        static void m2() {
            System.out.println(getCallerClassAndMethodName());
            m3();    }

        static void m3() {
            System.out.println(getCallerClassAndMethodName());    }

    public static String getCallerClassAndMethodName() {
        Throwable e = new Exception();
        if (e.getStackTrace().length < 3) {
            return null;
        } else {
            return e.getStackTrace()[2].getClassName().toString() + "#" + e.getStackTrace()[2].getMethodName().toString();
        }
    }
}
