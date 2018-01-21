package com.kamatama41.algorithm.chapter2;


import static com.kamatama41.algorithm.Utils.*;

public class Exercise2_8 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        while(--m != 0) {
            d += mdays[isLeap(y)][m-1];
        }
        return d;
    }

    public static void main(String[] args) {
        int year = inputInt("年");
        int month = inputInt("月");
        int day = inputInt("日");

        System.out.printf("年内の%d日目です。", dayOfYear(year, month, day));
    }
}
