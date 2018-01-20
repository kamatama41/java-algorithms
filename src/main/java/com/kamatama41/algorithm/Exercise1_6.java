package com.kamatama41.algorithm;

public class Exercise1_6 {

    public static void main(String[] args) {
        int n = 100;

        System.out.println("1から" + n + "までの和を求めます");
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1から" + n + "までの和は" + sum + "です。");
        System.out.println("iの値は" + i + "です。");
    }
}
