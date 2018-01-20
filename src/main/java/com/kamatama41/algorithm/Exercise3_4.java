package com.kamatama41.algorithm;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.inputInt;
import static com.kamatama41.algorithm.Utils.printHeader;
import static com.kamatama41.algorithm.Utils.sortedIntArray;

public class Exercise3_4 {
    static int binSearch(int[] a, int n, int key) {
        printHeader(n);

        int pl = 0;
        int pr = n - 1;
        do {
            int pc = (pl + pr) / 2;
            System.out.print("   |");
            for (int i = 0; i < n; i++) {
                int size = 0;
                if (i == pl) {
                    System.out.print("<-");
                    size += 2;
                }
                if (i == pc) {
                    if (size == 0) {
                        System.out.print("  ");
                        size += 2;
                    }
                    System.out.print("+");
                    size += 1;
                }
                if (i == pr) {
                    if (size == 0) {
                        System.out.print(" ");
                        size += 1;
                    }
                    System.out.print("->");
                    size += 2;
                }
                if (size < 3) {
                    for (int j = 0; j < 3 - size; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

            Utils.printArray(a, n, pc);
            if (a[pc] < key) {
                pl = pc + 1;
            } else if (a[pc] > key) {
                pr = pc - 1;
            } else {
                return pc;
            }
        } while (pl <= pr);
        return -1;
    }

    public static void main(String[] args) {
        int[] a = sortedIntArray(11);
        System.out.println(Arrays.toString(a));
        int key = inputInt("探す値");
        int idx = binSearch(a, a.length, key);
        System.out.println("idx: " + idx);
    }
}
