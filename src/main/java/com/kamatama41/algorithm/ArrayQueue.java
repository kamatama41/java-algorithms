package com.kamatama41.algorithm;

public class ArrayQueue<E> {
    private int max;
    private int front;
    private int rear;
    private int num;
    private E[] queue;

    // E以外のインスタンスが来ないことが保証されるため
    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.num = this.front = this.rear = 0;
        this.max = capacity;
        this.queue = (E[]) new Object[capacity];
    }

    public E enque(E e) {
        if (num >= max)
            throw new IllegalStateException("Queue is full.");
        queue[rear++] = e;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return e;
    }

    public E deque() {
        if (num <= 0)
            throw new IllegalStateException("No element.");
        E e = queue[front++];
        num--;
        if (front == max) {
            front = 0;
        }
        return e;
    }

    public E peek() {
        if (num <= 0)
            throw new IllegalStateException("No element");
        return queue[front];
    }

    public int indexOf(E e) {
        for (int i = 0; i < num; i++) {
            int actualIndex = (i + front) % max;
            if (queue[actualIndex].equals(e))
                return i;
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            int actualIndex = (i + front) % max;
            if (actualIndex == front) {
                System.out.print("*");
            }
            System.out.print(queue[actualIndex] + " ");
        }
        System.out.println("]");
    }
}
