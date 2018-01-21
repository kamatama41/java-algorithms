package com.kamatama41.algorithm.chapter2;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise2_2 {

    public static void main(String[] args) {
        int[] a = randomIntArray();
        int n = a.length;
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
