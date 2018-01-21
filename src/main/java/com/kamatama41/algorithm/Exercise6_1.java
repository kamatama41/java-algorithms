package com.kamatama41.algorithm;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise6_1 {
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
            System.out.print(i + ": ");
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble sorting");
        int n = 10;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        bubbleSort(a, n);
    }
}
