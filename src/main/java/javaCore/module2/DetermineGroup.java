package javaCore.module2;

public class DetermineGroup {

    public static void main(String[] args) {
        DetermineGroup d = new DetermineGroup();
        System.out.println(d.determineGroup(70));
    }

    public int determineGroup(int age) {
        return (age >= 7 && age <= 13) ? 1 : ((age >= 14 && age <= 17) ? 2 : ((age >= 18 && age <= 65) ? 3 : -1));
    }
}
