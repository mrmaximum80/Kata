package javaCore.module4.module4_3.m4_3_6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static void logging() {

        final Logger logger = Logger.getLogger("com.javamentor.logging.Test");

        logger.setLevel(Level.SEVERE);

        logger.log(Level.INFO, "Все хорошо");

        logger.log(Level.WARNING, "Произошла ошибка");

    }
}
