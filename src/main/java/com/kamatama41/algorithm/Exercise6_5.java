package com.kamatama41.algorithm;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;
import static com.kamatama41.algorithm.Utils.swap;

public class Exercise6_5 {
    static void print(int[] a, int n, int j, boolean swap) {
        System.out.print("j:" + j + "|");
        for (int k = 0; k < n; k++) {
            char symbol;
            if (k == j) {
                if (swap) {
                    symbol = '+';
                } else {
                    symbol = '-';
                }
            } else {
                symbol = ' ';
            }
            System.out.printf(" %d %c", a[k], symbol);
        }
        System.out.println();
    }

    static void shakerSort(int[] a, int n) {
        int totalNumOfComparing = 0;
        int totalNumOfSwapping = 0;
        int left = 0;
        int right = n - 1;
        int last = right;
        while (left < right) {
            System.out.printf("left(%d)<-right(%d)\n", left, right);
            for (int j = right; j > left; j--) {
                boolean swap = a[j - 1] > a[j];
                totalNumOfComparing++;
                print(a, n, j - 1, swap);
                if (swap) {
                    swap(a, j - 1, j);
                    totalNumOfSwapping++;
                    last = j;
                }
            }
            left = last;

            System.out.printf("left(%d)->right(%d)\n", left, right);
            for (int j = left; j < right; j++) {
                boolean swap = a[j] > a[j+1];
                print(a, n, j, swap);
                if (swap) {
                    swap(a, j, j + 1);
                    totalNumOfSwapping++;
                    last = j;
                }
                totalNumOfComparing++;
            }
            right = last;

            if (left == right) {
                System.out.println("おわり");
                System.out.printf("left(%d)=right(%d)\n", left, right);
            }
        }
        System.out.println("Comparing: " + totalNumOfComparing);
        System.out.println("Swapping: " + totalNumOfSwapping);
    }

    public static void main(String[] args) {
        System.out.println("Shaker sorting");
        int n = 10;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        shakerSort(a, n);
        System.out.println("Result: " + Arrays.toString(a));
    }
}
