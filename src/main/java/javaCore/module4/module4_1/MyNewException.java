package javaCore.module4.module4_1;

class MyNewException extends Exception {

    public MyNewException(String message) {
        super(message);
    }

    public MyNewException(String message, Throwable cause) {
        super(message, cause);
    }
}
