package com.gfg.crash;

public class MyHash {
    private int[] arr;
    private int capacity;
    private int size;

    public MyHash(int capacity) {
        this.capacity = capacity;
        initializeTable(capacity);
    }

    private int calculateHash(int i) {
        return i % capacity;
    }

    private void initializeTable(int size) {
        this.arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = -1;
        }
    }

    public void insert(int e) {
        int i = calculateHash(e);
        if (arr[i] == -1 || arr[i] == -2) { //slot empty or element was deleted before
            arr[i] = e;
        } else {

        }
    }

    public boolean search(int e) {
        int hash = calculateHash(e);
        int i = hash;
        while (arr[i] != -1) {
            if (arr[i] == e) {
                return true;
            }
            i = (i + 1) % capacity;
            if (i == hash) {
                return false;
            }
        }

        return false;
    }

    public void erase(int e) {
        int i = calculateHash(e);
        if (arr[i] == e) {
            arr[i] = -2;
        }
    }
}
