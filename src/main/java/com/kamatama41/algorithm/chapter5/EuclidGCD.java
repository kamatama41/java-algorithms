package com.kamatama41.algorithm.chapter5;

import static com.kamatama41.algorithm.Utils.randomInt;

public class EuclidGCD {

    static int gcd(int x, int y) {
        System.out.printf("(%d, %d)\n", x, y);
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        int n1 = randomInt(1000);
        int n2 = randomInt(1000);
        int x = Math.max(n1, n2);
        int y = Math.min(n1, n2);
        System.out.printf("gcd(%d, %d) = %d", x, y, gcd(x, y));
    }
}
