package com.kamatama41.algorithm;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise2_5 {

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = randomIntArray(n + 2);
        int[] b = randomIntArray(n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        rcopy(a, b);
        System.out.println(Arrays.toString(a));
    }
}
