package com.kamatama41.algorithm.chapter5;

import java.util.Arrays;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise5_3 {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    static int gcdArray(int[] a) {
        int gcd = a[0];
        for (int anA : a) {
            System.out.printf("(%d, %d)\n", gcd, anA);
            gcd = gcd(gcd, anA);
        }
        return gcd;
    }

    public static void main(String[] args) {
        int[] a = randomNonZeroIntArray(3, 12);
        System.out.printf("gcd(%s) = %d", Arrays.toString(a), gcdArray(a));
    }
}
