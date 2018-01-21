package com.kamatama41.algorithm.chapter1;

import java.util.Scanner;

public class Exercise1_16 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("ピラミッドを表示します");

        int n;
        do {
            System.out.print("段数は: "); n = stdIn.nextInt();
        } while (n <= 0);

        myPyramid(n);
    }

    static void myPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
