package com.kamatama41.algorithm.chapter6;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;
import static com.kamatama41.algorithm.Utils.swap;

public class Exercise6_4 {
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

    static void bubbleSort(int[] a, int n) {
        int totalNumOfComparing = 0;
        int totalNumOfSwapping = 0;
        int i = 0;
        while (i < n - 1) {
            System.out.printf("パス%d: \n", i);
            int numOfSwapping = 0;
            int lastSwapped = n - 1;
            for (int j = n - 1; j > i; j--) {
                boolean swap = a[j - 1] > a[j];
                totalNumOfComparing++;
                print(a, n, j - 1, swap);
                if (swap) {
                    swap(a, j - 1, j);
                    numOfSwapping++;
                    lastSwapped = j;
                }
            }
            if (numOfSwapping == 0) {
                System.out.println("打ち切り");
                break;
            }
            totalNumOfSwapping += numOfSwapping;
            i = lastSwapped;
            System.out.println();
        }
        System.out.println("Comparing: " + totalNumOfComparing);
        System.out.println("Swapping: " + totalNumOfSwapping);
    }

    public static void main(String[] args) {
        System.out.println("Bubble sorting");
        int n = 20;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        bubbleSort(a, n);
        System.out.println("Result: " + Arrays.toString(a));
    }
}
