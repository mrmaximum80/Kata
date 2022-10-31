package javaCore.module3.module3_1;

public class CatDog {

    public static class Cat {

        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {

        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            Dog dog = new Dog();
            dog.sayHello();
            cat.sayHello();
        }
    }
}
