package javaCore.module4.module4_1;

public class TestExp {

    public static void main(String[] args) throws MyNewException {

        TestExp a = new TestExp();
        a.testExp();

    }

    public void testExp() throws MyNewException {
        throw new MyNewException("Ошибка!");
    }
}
