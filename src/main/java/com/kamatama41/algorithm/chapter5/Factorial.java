package com.kamatama41.algorithm.chapter5;

import static com.kamatama41.algorithm.Utils.*;

public class Factorial {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = randomInt(20);
        System.out.printf("%d! = %d", n, factorial(n));
    }
}
