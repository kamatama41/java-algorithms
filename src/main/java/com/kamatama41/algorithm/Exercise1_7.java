package com.kamatama41.algorithm;

public class Exercise1_7 {

    public static void main(String[] args) {
        int n = 100;

        System.out.println("1から" + n + "までの和を求めます");
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sum += i;
            sb.append(i);
            if (i < n) {
                sb.append(" + ");
            }
        }
        System.out.println(sb.toString() + " = " + sum);
    }
}
