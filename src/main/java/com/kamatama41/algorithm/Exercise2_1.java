package com.kamatama41.algorithm;

import java.util.Random;

public class Exercise2_1 {

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("身長の最大値を求めます");

        int n = 1 + rand.nextInt(10);
        System.out.println("人数は: " + n);
        int[] heights = new int[n];
        System.out.println("身長は次のようになっています");
        for (int i = 0; i < n; i++) {
            heights[i] = 100 + rand.nextInt(90);
            System.out.printf("height[%d]=%d\n", i, heights[i]);
        }
        System.out.printf("最大値は%dです", maxOf(heights));
    }
}
