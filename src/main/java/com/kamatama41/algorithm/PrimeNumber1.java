package com.kamatama41.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                System.out.println(n);
            }
        }
        System.out.println("除算を行った回数: " + counter);
    }
}
