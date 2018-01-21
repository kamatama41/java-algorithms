package com.kamatama41.algorithm;

import java.util.stream.IntStream;

import static com.kamatama41.algorithm.Utils.*;

public class Exercise4_1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>(36);
        System.out.printf("Is empty? -> %s\n", stack.isEmpty());
        for (char c : alphaNumerics()) {
            stack.push(c);
            stack.dump();
        }
        System.out.printf("Is full? -> %s\n", stack.isFull());

        IntStream.range(0, 18).forEach(unused -> {
            stack.pop();
            stack.dump();
            char c = randomChar();
            System.out.printf("Index of %c is %d\n", c, stack.indexOf(c));
        });
        System.out.printf("Current peek is %s\n", stack.peek());
    }
}
