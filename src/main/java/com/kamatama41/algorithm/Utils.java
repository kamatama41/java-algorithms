package com.kamatama41.algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Utils {
    private static String ALPHA_NUMERIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static Random RAND = new Random();
    private static Scanner STDIN = new Scanner(System.in);

    private Utils() {
    }

    public static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static int randomInt(int n) {
        return RAND.nextInt(n);
    }

    public static boolean randomBool() {
        return RAND.nextBoolean();
    }

    public static char randomChar() {
        char[] chars = alphaNumerics();
        return chars[randomInt(chars.length)];
    }

    public static int[] randomIntArray() {
        return randomIntArray(1 + randomInt(10));
    }

    public static int[] randomIntArray(int n) {
        System.out.println("要素数は: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RAND.nextInt(100);
        }
        return a;
    }

    public static int[] sortedIntArray(int n) {
        System.out.println("要素数は: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RAND.nextInt(100);
        }
        Arrays.sort(a);
        return a;
    }

    public static char[] alphaNumerics() {
        return ALPHA_NUMERIC.toCharArray();
    }

    public static int inputInt(String message) {
        return inputInt(message, null, n -> false);
    }

    public static int inputInt(String message, IntPredicate condition) {
        return inputInt(message, null, condition);
    }

    public static int inputInt(String message, String errMessage, IntPredicate condition) {
        int result;
        System.out.print(message + ": ");
        result = STDIN.nextInt();
        while (condition.test(result)) {
            if (errMessage != null) {
                System.out.println(errMessage);
            }
            System.out.print(message + ": ");
            result = STDIN.nextInt();
        }
        return result;
    }

    public static void printHeader(int n) {
        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %2d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < n; i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    public static void printArray(int[] a, int n, int idx) {
        System.out.printf(" %2d|", idx);
        for (int i = 0; i < n; i++) {
            System.out.printf(" %2d", a[i]);
        }
        System.out.println();
    }
}
