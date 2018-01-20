package com.kamatama41.algorithm;

public class Exercise1_12 {

    public static void main(String[] args) {

        // Header
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int j = 1; j <= 9; j++) {
            System.out.print("---");
        }
        System.out.println();
        // Content
        for (int i = 1; i <= 9; i++) {
            System.out.printf(" %d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
