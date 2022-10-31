package javaCore.module2;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] a1 = {0, 2, 2, 5, 7};
        int[] a2 = {1, 3, 4, 6};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1 == null && a2 == null) {
            return null;
        }
        if (a1 == null) {
            return a2;
        }
        if (a2 == null) {
            return a1;
        }

        int[] mergeArr = new int[a1.length + a2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < mergeArr.length; i++) {
            if (j < a1.length && k < a2.length) {
                if (a1[j] < a2[k]) {
                    mergeArr[i] = a1[j++];
                } else {
                    mergeArr[i] = a2[k++];
                }
            } else {
                if (k < a2.length) {
                    mergeArr[i] = a2[k++];
                }
                if (j < a1.length) {
                    mergeArr[i] = a1[j++];
                }
            }
        }
        return mergeArr;
    }
}
