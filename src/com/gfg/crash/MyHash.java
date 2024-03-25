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

    public boolean insert(int e) {
        if (size == capacity) return false;
        int i = calculateHash(e);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != e) { //slot empty and element was deleted before and element doesnt exist
            i = (i + 1) % capacity;
        }
        if (arr[i] == e) {
            return false;
        } else {
            arr[i] = e;
            size++;
            return true;
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
        int hash = calculateHash(e);
        int i = hash;
        while(arr[i] != -1) {
            if (arr[i] == e) {
                arr[i] = -2;
                return;
            }
            i = (i+1)%capacity;
            if (i==hash){
                return;
            }
        }

    }
}
