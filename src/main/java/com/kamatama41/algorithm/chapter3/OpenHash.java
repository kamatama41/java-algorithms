package com.kamatama41.algorithm.chapter3;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class OpenHash<K, V> {
    private int size;
    private Bucket<K, V>[] table;

    public OpenHash(int capacity) {
        this.table = new Bucket[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new Bucket<>();
        }
        this.size = capacity;
    }

    public int hashValue(K key) {
        return key.hashCode() % size;
    }

    public int rehashValue(int hash) {
        return (hash + 1) % size;
    }

    public V search(K key) {
        Bucket<K, V> node = searchNode(key);
        if (node != null) {
            return node.value;
        } else {
            return null;
        }
    }

    public int add(K key, V value) {
        int hash = hashValue(key);
        Bucket<K, V> bucket = table[hash];
        int rehashed = hash;
        while (bucket.status == Status.OCCUPIED){
            if (bucket.key.equals(key)) {
                return 1;
            }
            rehashed = rehashValue(rehashed);
            if (rehashed == hash) {
                return 2;
            }
            bucket = table[rehashed];
        }

        bucket.set(key, value, Status.OCCUPIED);
        return 0;
    }

    public int remove(K key) {
        Bucket<K, V> node = searchNode(key);
        if (node != null) {
            node.set(null, null, Status.DELETED);
            return 0;
        } else {
            return 1;
        }
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d ", i);
            switch (table[i].status) {
                case OCCUPIED:
                    System.out.printf("%s:%d(%s)\n", table[i].key, hashValue(table[i].key), table[i].value);
                    break;
                case EMPTY:
                    System.out.println("-- 未登録 --");
                    break;
                case DELETED:
                    System.out.println("-- 削除済み --");
                    break;
            }
        }
    }

    private Bucket<K, V> searchNode(K key) {
        int hash = hashValue(key);
        Bucket<K, V> bucket = table[hash];
        int rehashed = hash;
        do {
            if (bucket.status == Status.OCCUPIED && bucket.key.equals(key)) {
                return bucket;
            }
            rehashed = rehashValue(rehashed);
            bucket = table[rehashed];
        } while (rehashed != hash);
        return null;
    }

    enum Status {OCCUPIED, EMPTY, DELETED}

    static class Bucket<K, V> {
        private K key;
        private V value;
        private Status status;

        Bucket() {
            status = Status.EMPTY;
        }

        void set(K key, V value, Status status) {
            this.key = key;
            this.value = value;
            this.status = status;
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }

    public static void main(String[] args) {
        OpenHash<Integer, Integer> hash = new OpenHash<>(13);
        Arrays.asList(5, 6, 14, 20, 29, 34, 37, 51, 69, 75, 17, 33, 33, 26, 10).forEach(i -> {
            System.out.println("## Add: " + i + ", " + hash.add(i, i));
            hash.dump();
        });
        System.out.print("Search 17 => ");
        System.out.println(hash.search(17));
        System.out.print("Remove 17 => ");
        System.out.println(hash.remove(17));
        hash.dump();
    }
}
