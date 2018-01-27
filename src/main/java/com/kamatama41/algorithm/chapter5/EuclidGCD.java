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
        int x = randomInt(1000);
        int y = randomInt(1000);
        System.out.printf("gcd(%d, %d) = %d", x, y, gcd(x, y));
    }
}
