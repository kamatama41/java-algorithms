package com.kamatama41.algorithm;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise2_4 {

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = randomIntArray(n);
        int[] b = randomIntArray(n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        copy(a, b);
        System.out.println(Arrays.toString(a));
    }
}
