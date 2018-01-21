package com.kamatama41.algorithm.chapter1;

import java.util.Scanner;

public class Exercise1_10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a: "); int a = stdIn.nextInt();

        int b;
        System.out.print("b: "); b = stdIn.nextInt();
        while (b <= a) {
            System.out.println("input bigger than a!");
            System.out.print("b: "); b = stdIn.nextInt();
        }
        System.out.println("b - a = " + (b - a));
    }
}
