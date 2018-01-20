package com.kamatama41.algorithm;


import static com.kamatama41.algorithm.Utils.*;

public class Exercise2_6 {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x = x / r;
        } while(x != 0);

        for (int i = 0; i < digits / 2; i++) {
            swap(d, i, digits - 1 - i);
        }
        return digits;
    }

    public static void main(String[] args) {
        char[] cno = new char[32];

        System.out.println("10進数を基数変換します。");
        int n = randomInt(100);
        System.out.println("変換する非負の整数: " + n);
        int cd = inputInt("何進数に変換しますか(2-36)", (i) -> i < 2 || i > 36);
        int digits = cardConv(n, cd, cno);

        System.out.println(cd + "進数では");
        for (int i = 0; i < digits; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("です");
    }
}
