package com.kamatama41.algorithm;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Utils {
    private static Random RAND = new Random();
    private static Scanner STDIN = new Scanner(System.in);

    private Utils() {}

    static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static int[] randomIntArray() {
        return randomIntArray(1 + randomInt(10));
    }

    static int[] randomIntArray(int n) {
        System.out.println("要素数は: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RAND.nextInt(100);
        }
        return a;
    }

    static int randomInt(int n) {
        return RAND.nextInt(n);
    }

    static int inputInt(String message) {
        return inputInt(message, null, n -> false);
    }

    static int inputInt(String message, IntPredicate condition) {
        return inputInt(message, null, condition);
    }

    static int inputInt(String message, String errMessage, IntPredicate condition) {
        int result;
        System.out.print(message + ": "); result = STDIN.nextInt();
        while(condition.test(result)) {
            if(errMessage != null) {
                System.out.println(errMessage);
            }
            System.out.print(message + ": "); result = STDIN.nextInt();
        }
        return result;
    }
}
