package com.gfg.crash;

public class Hashing {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(7);
        myHash.insert(49);
        myHash.insert(56);
        myHash.insert(72);
        System.out.println(myHash.search(56));
        myHash.erase(56);
        System.out.println(myHash.search(56));
    }
}
