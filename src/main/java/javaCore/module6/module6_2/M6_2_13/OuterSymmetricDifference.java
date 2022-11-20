package javaCore.module6.module6_2.M6_2_13;

import java.util.HashSet;
import java.util.Set;

public class OuterSymmetricDifference {

    Set<Integer> set = new HashSet();

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>();
        for (T s1 : set1) {
            if (set2.contains(s1)) {
            } else {
                set3.add(s1);
            }
        }
        for (T s2 : set2) {
            if (set1.contains(s2)) {
            } else {
                set3.add(s2);
            }
        }
        return set3;
    }
}
