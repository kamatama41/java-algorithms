package com.kamatama41.algorithm;

import java.util.Random;

public class Utils {
    private static Random RAND = new Random();

    private Utils() {}

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static int[] randomIntArray() {
        return randomIntArray(1 + RAND.nextInt(10));
    }

    static int[] randomIntArray(int n) {
        System.out.println("要素数は: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RAND.nextInt(100);
        }
        return a;
    }
}
