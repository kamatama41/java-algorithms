package com.kamatama41.algorithm;

public class Utils {
    private Utils() {}

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
