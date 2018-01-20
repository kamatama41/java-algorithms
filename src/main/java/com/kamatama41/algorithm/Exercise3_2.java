package com.kamatama41.algorithm;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.inputInt;
import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise3_2 {
    static int seqSearchSen2(int[] a, int n, int key) {
        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %2d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < n; i++) {
            System.out.print("---");
        }
        System.out.println();


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
            System.out.printf(" %2d|", i);
            for (int j = 0; j < n; j++) {
                System.out.printf(" %2d", a[j]);
            }
            System.out.println();
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
