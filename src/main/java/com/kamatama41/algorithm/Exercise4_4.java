package com.kamatama41.algorithm;

import java.util.stream.IntStream;

import static com.kamatama41.algorithm.Utils.alphaNumerics;
import static com.kamatama41.algorithm.Utils.randomChar;

public class Exercise4_4 {
    public static void main(String[] args) {
        ArrayQueue<Character> stack = new ArrayQueue<>(36);
        System.out.printf("Is empty? -> %s\n", stack.isEmpty());
        for (char c : alphaNumerics()) {
            stack.enque(c);
            stack.dump();
        }
        System.out.printf("Is full? -> %s\n", stack.isFull());

        IntStream.range(0, 18).forEach(unused -> {
            stack.deque();
            stack.dump();
            char c = randomChar();
            System.out.printf("Index of %c is %d\n", c, stack.indexOf(c));
        });
        System.out.printf("Current peek is %s\n", stack.peek());
    }
}
