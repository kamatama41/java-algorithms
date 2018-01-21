package com.kamatama41.algorithm.chapter3;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.inputInt;
import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise3_1 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i;
        a[n] = key; // sentinel
        for (i = 0; i <= n; i++) {
            if (a[i] == key)
                break;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = randomIntArray(n + 1);
        a[n] = 0;
        System.out.println(Arrays.toString(a));

        int ky = inputInt("探す値");
        int idx = seqSearchSen(a, n, ky);

        if (idx == -1) {
            System.out.println("その値は存在しません");
        } else {
            System.out.println("その値はx[" + idx + "]にあります");
        }

    }
}
