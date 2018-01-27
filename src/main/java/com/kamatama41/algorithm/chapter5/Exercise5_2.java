package com.kamatama41.algorithm.chapter5;

import static com.kamatama41.algorithm.Utils.randomInt;

public class Exercise5_2 {

    static int gcd(int x, int y) {
        do {
            System.out.printf("(%d, %d)\n", x, y);
            int tmp = y;
            y = x % y;
            x = tmp;
        } while(y > 0);
        return x;
    }

    public static void main(String[] args) {
        int n1 = randomInt(1000);
        int n2 = randomInt(1000);
        int x = Math.max(n1, n2);
        int y = Math.min(n1, n2);
        System.out.printf("gcd(%d, %d) = %d", x, y, gcd(x, y));
    }
}
