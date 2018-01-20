package com.kamatama41.algorithm;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ChainHash<K, V> {
    private int size;
    private Node<K, V>[] table;

    public ChainHash(int capacity) {
        this.table = new Node[capacity];
        this.size = capacity;
    }

    public int hashValue(K key) {
        return key.hashCode() % size;
    }

    public V search(K key) {
        int hash = hashValue(key);
        Node<K, V> node = table[hash];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public int add(K key, V value) {
        int hash = hashValue(key);
        Node<K, V> node = table[hash];
        while (node != null) {
            if (node.key.equals(key)) {
                return 1;   // The key already exists in this Hash
            }
            node = node.next;
        }
        table[hash] = new Node<>(key, value, table[hash]);
        return 0;
    }

    public int remove(K key) {
        int hash = hashValue(key);
        Node<K, V> node = table[hash];
        Node<K, V> parent = null;

        while (node != null) {
            if (node.key.equals(key)) {
                if (parent == null) {
                    table[hash] = node.next;
                } else {
                    parent.next = node.next;
                }
                return 0;
            }
            parent = node;
            node = node.next;
        }
        return 1;
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            Node<K, V> node = table[i];
            System.out.printf("%2d ", i);
            while (node != null) {
                System.out.printf("-> %s(%s) ", node.key, node.value);
                node = node.next;
            }
            System.out.println();
        }
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }

    public static void main(String[] args) {
        ChainHash<Integer, Integer> hash = new ChainHash<>(13);
        Arrays.asList(5, 6, 14, 20, 29, 34, 37, 51, 69, 75, 17, 33, 33).forEach(i -> {
            hash.add(i, i);
            hash.dump();
            System.out.println("========================================");
        });
        System.out.print("Search 17 => ");
        System.out.println(hash.search(17));
        System.out.print("Remove 17 => ");
        System.out.println(hash.remove(17));
        hash.dump();
    }
}
