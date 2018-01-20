package com.kamatama41.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);

        int idxOfPrimes = 2;
        for (int n = 5; n <= 1000; n += 2) {
            boolean isPrime = true;
            for (int i = 1; primes.get(i) * primes.get(i) <= n; i++) {
                counter += 2;
                if (n % primes.get(i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(idxOfPrimes++, n);
                counter++;
            }
        }
        primes.forEach(System.out::println);
        System.out.println("除算を行った回数: " + counter);
    }
}
