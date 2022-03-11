package com.renaissance.recursion;

public class TwoBranchRecursion {
    public static void main(String[] args) {
        int x = 0;
        func(x);
    }

    private static void func(int x) {
        System.out.println(x);
        if (x>=3)return;
        func(x+1);
        func(x+2);
    }
}
