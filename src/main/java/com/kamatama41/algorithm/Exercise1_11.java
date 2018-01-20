package com.kamatama41.algorithm;

import java.util.Scanner;

public class Exercise1_11 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n: "); int n = stdIn.nextInt();

        int digits = 1;
        int quotient = n;
        while (quotient >= 10) {
            quotient = quotient / 10;
            digits++;
        }
        System.out.println(n + " is " + digits + "-digits");
    }
}
