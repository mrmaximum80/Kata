package javaCore.module4.module4_2.m4_2_6;

public class BadCreditHistoryException extends Exception{

    public BadCreditHistoryException(String message) {
        super(message);
    }

    public BadCreditHistoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
