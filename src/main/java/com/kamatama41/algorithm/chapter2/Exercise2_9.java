package com.kamatama41.algorithm.chapter2;


import static com.kamatama41.algorithm.Utils.inputInt;

public class Exercise2_9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 平年
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 閏年
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int leftDays = 0;
        for (int i = m - 1; i < 12; i++) {
            leftDays += mdays[isLeap(y)][i];
        }
        return leftDays - d + 1;
    }

    public static void main(String[] args) {
        int year = inputInt("年");
        int month = inputInt("月");
        int day = inputInt("日");

        System.out.printf("今年もあと%d日です。", leftDayOfYear(year, month, day));
    }
}
