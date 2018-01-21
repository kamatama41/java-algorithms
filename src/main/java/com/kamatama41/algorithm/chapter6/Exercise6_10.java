package com.kamatama41.algorithm.chapter6;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;
import static com.kamatama41.algorithm.Utils.swap;

public class Exercise6_10 {

    // TODO: 分からない..
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    System.out.printf("[h:%2d, i:%2d, j:%2d, a[j]:%2d, tmp:%2d]\n", h, i, j, a[j], tmp);
                    a[i] = a[j];
                }
                a[j + h] = tmp;
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        System.out.println("Shell sorting");
        int n = 8;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        shellSort(a, n);
        System.out.println("Result: " + Arrays.toString(a));
    }
}
