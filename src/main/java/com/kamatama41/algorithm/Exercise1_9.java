package com.kamatama41.algorithm;

public class Exercise1_9 {

    static void sumOf(int a, int b) {
        System.out.println(a + "から" + b + "までの和を求めます");
        int bigger, smaller;
        if (a > b) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }
        int sum = ((bigger + smaller) * (bigger - smaller + 1)) / 2;
        System.out.println(a + "から" + b + "までの和は" + sum + "です。");
    }
    public static void main(String[] args) {
        sumOf(3, 5);
        sumOf(6, 4);
    }
}
