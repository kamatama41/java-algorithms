package com.kamatama41.algorithm;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;
import static com.kamatama41.algorithm.Utils.swap;

public class Exercise6_3 {
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
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("パス%d: \n", i);
            int numOfSwapping = 0;
            for (int j = 0; j < n - i - 1; j++) {
                boolean swap = a[j] > a[j + 1];
                totalNumOfComparing++;
                print(a, n, j, swap);
                if (swap) {
                    swap(a, j, j + 1);
                    numOfSwapping++;
                }
            }
            if (numOfSwapping == 0) {
                System.out.println("打ち切り");
                break;
            }
            totalNumOfSwapping += numOfSwapping;
            System.out.println();
        }
        System.out.println("Comparing: " + totalNumOfComparing);
        System.out.println("Swapping: " + totalNumOfSwapping);
    }

    public static void main(String[] args) {
        System.out.println("Bubble sorting");
        int n = 10;
        int[] a = randomIntArray(n);
        System.out.println(Arrays.toString(a));

        bubbleSort(a, n);
        System.out.println("Result: " + Arrays.toString(a));
    }
}
