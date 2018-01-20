package com.kamatama41.algorithm;

import java.util.Arrays;
import java.util.Random;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise2_2 {

    public static void main(String[] args) {
        Random rand = new Random();

        int n = 1 + rand.nextInt(10);
        System.out.println("要素数は: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            swap(a, i, j);
            System.out.printf("a[%d]とa[%d]を交換します\n", i, j);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("反転が終了しました。");
    }
}
