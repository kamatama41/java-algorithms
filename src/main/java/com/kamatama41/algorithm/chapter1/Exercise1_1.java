package com.kamatama41.algorithm.chapter1;

import java.util.Scanner;

public class Exercise1_1 {

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a: "); int a = stdIn.nextInt();
        System.out.println("b: "); int b = stdIn.nextInt();
        System.out.println("c: "); int c = stdIn.nextInt();
        System.out.println("d: "); int d = stdIn.nextInt();

        System.out.println("max = " + max4(a, b, c, d));
    }

    public static void test() {
        System.out.println(max4(4, 3, 2, 1)); // [A] a > b > c > d
        System.out.println(max4(4, 3, 2, 2)); // [B] a > b > c = d
        System.out.println(max4(4, 3, 1, 2)); // [C] a > b > d > c
        System.out.println(max4(4, 3, 1, 3)); // [D] a > b = d > c
        System.out.println(max4(4, 2, 1, 3)); // [E] a > d > b > c
        System.out.println(max4(4, 3, 3, 2)); // [F] a > b = c > d
        System.out.println(max4(4, 3, 3, 3)); // [G] a > b = c = d
        System.out.println(max4(4, 2, 2, 3)); // [H] a > d > b = c
        System.out.println(max4(4, 2, 3, 1)); // [I] a > c > b > d
        System.out.println(max4(4, 2, 3, 2)); // [J] a > c > b = d
        System.out.println(max4(4, 1, 3, 2)); // [K] a > c > d > b
        System.out.println(max4(4, 2, 3, 3)); // [L] a > c = d > b
        System.out.println(max4(4, 1, 2, 3)); // [M] a > d > c > b

        //TODO: needs more patterns
    }
}
