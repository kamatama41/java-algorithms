package com.kamatama41.algorithm;


import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;

public class Exercise2_3 {

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = randomIntArray();
        System.out.println(Arrays.toString(a));
        System.out.printf("合計値は%sです", sumOf(a));
    }
}
