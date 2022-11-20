package javaCore.module6.module6_2.M6_2_12;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CollObj {

    public static void main(String[] args) {

        Collection<?> collection = new LinkedHashSet<>();
        Object object = new Object();

        collection.contains(object);
    }
}
