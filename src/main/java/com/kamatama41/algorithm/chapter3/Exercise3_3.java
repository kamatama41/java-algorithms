package com.kamatama41.algorithm.chapter3;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.inputInt;
import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise3_3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 8;
        int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] idx = new int[num];
        int key = 9;
        int count = searchIdx(a, num, key, idx);
        System.out.println("count: " + count);
        System.out.println("idx: " + Arrays.toString(idx));
    }
}
