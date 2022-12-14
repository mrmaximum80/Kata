package javaCore.module3.module3_1;

public class HumanRunner {

    public static void main(String[] args) {

        Human human1 = new Human();
        Human human2 = new Human((byte) 10, "Вася", "Пупкин", "Футбол");
        Human human3 = new Human((byte) 20, "Петя", "Петров");
    }

    public static class Human{
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {};

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this(age, name, secondName);
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }

    }
}
