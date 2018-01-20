package com.kamatama41.algorithm;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise3_2 {
    static int seqSearchSen2(int[] a, int n, int key) {
        printHeader(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("   |");
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

            printArray(a, n, i);
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        int ky = inputInt("探す値");
        int idx = seqSearchSen2(a, n, ky);

        if (idx == -1) {
            System.out.println("その値は存在しません");
        } else {
            System.out.println("その値はx[" + idx + "]にあります");
        }

    }
}
