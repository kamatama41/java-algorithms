package com.kamatama41.algorithm.chapter1;

public class Exercise1_5 {

    static int med3_2(int a, int b, int c) {
        // b >= a を最初のifでやってるが、次のelse ifでもa > bを計算しているため
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        test();
    }

    static void test() {
        System.out.println(med3_2(3, 2, 1)); // [A] a > b > c
        System.out.println(med3_2(3, 2, 2)); // [B] a > b = c
        System.out.println(med3_2(3, 1, 2)); // [C] a > c > b
        System.out.println(med3_2(3, 1, 3)); // [D] a = c > b
        System.out.println(med3_2(2, 1, 3)); // [E] c > a > b
        System.out.println(med3_2(3, 3, 2)); // [F] a = b > c
        System.out.println(med3_2(3, 3, 3)); // [G] a = b = c
        System.out.println(med3_2(2, 2, 3)); // [H] c > a = b
        System.out.println(med3_2(2, 3, 1)); // [I] b > a > c
        System.out.println(med3_2(2, 3, 2)); // [J] b > a = c
        System.out.println(med3_2(1, 3, 2)); // [K] b > c > a
        System.out.println(med3_2(2, 3, 3)); // [L] b = c > a
        System.out.println(med3_2(1, 2, 3)); // [M] c > b > a
    }
}
