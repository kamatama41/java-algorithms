package com.kamatama41.algorithm;

public class Exercise1_4 {

    static int med3(int a, int b, int c) {
        if (a > b) {
            if (b >= c) {
                return b;       // a > b > c or a > b = c
            } else {
                if (a >= c) {
                    return c;   // a > c > b or a = c > b
                } else {
                    return a;   // c > a > b
                }
            }
        } else if (a == b) {
            return a;           // a = b > c or a = b = c or c > a = b
        } else {
            if (a >= c) {
                return a;       // b > a > c or b > a == c
            } else {
                if (b >= c) {
                    return c;   // b > c > a or b == c > a
                } else {
                    return b;   // c > b > a
                }
            }
        }
    }

    public static void main(String[] args) {
        test();
    }

    static void test() {
        System.out.println(med3(3, 2, 1)); // [A] a > b > c
        System.out.println(med3(3, 2, 2)); // [B] a > b = c
        System.out.println(med3(3, 1, 2)); // [C] a > c > b
        System.out.println(med3(3, 1, 3)); // [D] a = c > b
        System.out.println(med3(2, 1, 3)); // [E] c > a > b
        System.out.println(med3(3, 3, 2)); // [F] a = b > c
        System.out.println(med3(3, 3, 3)); // [G] a = b = c
        System.out.println(med3(2, 2, 3)); // [H] c > a = b
        System.out.println(med3(2, 3, 1)); // [I] b > a > c
        System.out.println(med3(2, 3, 2)); // [J] b > a = c
        System.out.println(med3(1, 3, 2)); // [K] b > c > a
        System.out.println(med3(2, 3, 3)); // [L] b = c > a
        System.out.println(med3(1, 2, 3)); // [M] c > b > a
    }
}
