package com.kamatama41.algorithm.chapter2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        int idxOfPrimes = 1;
        for (int n = 3; n <= 1000; n += 2) {
            int i;
            for (i = 1; i < idxOfPrimes; i++) {
                counter++;
                if (n % primes.get(i) == 0) {
                    break;
                }
            }
            if (i == idxOfPrimes) {
                primes.add(idxOfPrimes++, n);
            }
        }
        primes.forEach(System.out::println);
        System.out.println("除算を行った回数: " + counter);
    }
}
