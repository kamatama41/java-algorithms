package com.kamatama41.algorithm.chapter5;

public class Exercise5_1 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d! = %d\n", i, factorial(i));
        }
    }
}
