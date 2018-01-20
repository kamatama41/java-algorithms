package com.kamatama41.algorithm;

public class PrimeNumber1_1 {
    public static void main(String[] args) {
        int counter = 0;

        System.out.println(2);
        for (int n = 3; n <= 1000; n += 2) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                counter++;
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
        System.out.println("除算を行った回数: " + counter);
    }
}
