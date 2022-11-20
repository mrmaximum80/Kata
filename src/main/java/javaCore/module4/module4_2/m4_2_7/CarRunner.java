package javaCore.module4.module4_2.m4_2_7;

public class CarRunner {

    public static void main(String[] args) {
        try (Car car = new Car()) {
            Car.drive();
        } catch (Exception e) {
        }
    }

    public static class Car implements AutoCloseable {

        public static void drive() {
            System.out.println("Машина поехала.");
        }

        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }
    }
}
