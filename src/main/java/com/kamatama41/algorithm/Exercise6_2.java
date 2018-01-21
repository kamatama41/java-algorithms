package com.kamatama41.algorithm;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.randomIntArray;
import static com.kamatama41.algorithm.Utils.swap;

public class Exercise6_2 {
    static void bubbleSort(int[] a, int n) {
        int numOfComparing = 0;
        int numOfSwapping = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("パス%d: \n", i);
            for (int j = 0; j < n - i - 1; j++) {
                boolean swap = a[j] > a[j + 1];
                numOfComparing++;

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

                if(swap) {
                    swap(a, j, j + 1);
                    numOfSwapping++;
                }
            }
            System.out.println();
        }

        System.out.println("Comparing: " + numOfComparing);
        System.out.println("Swapping: " + numOfSwapping);
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
