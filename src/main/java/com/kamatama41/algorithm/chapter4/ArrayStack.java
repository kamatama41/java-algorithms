package com.kamatama41.algorithm.chapter4;

public class ArrayStack<E> {
    private int max;
    private int pointer;
    private E[] stack;

    // E以外のインスタンスが来ないことが保証されるため
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.pointer = 0;
        this.max = capacity;
        stack = (E[]) new Object[capacity];
    }

    public E push(E e) {
        if (pointer >= max)
            throw new IllegalStateException("Stack is full.");
        return stack[pointer++] = e;
    }

    public E pop() {
        if (pointer <= 0)
            throw new IllegalStateException("No element.");
        E e = stack[--pointer];
        stack[pointer] = null;  // To remove implicit reference
        return e;
    }

    public E peek() {
        if (pointer <= 0)
            throw new IllegalStateException("No element");
        return stack[pointer - 1];
    }

    public int indexOf(E e) {
        for (int i = pointer - 1; i >= 0; i--) {
            if (stack[i].equals(e))
                return i;
        }
        return -1;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= max;
    }

    public void dump() {
        for (int i = 0; i < pointer; i++) {
            if (i == pointer - 1) {
                System.out.print("*");
            }
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
