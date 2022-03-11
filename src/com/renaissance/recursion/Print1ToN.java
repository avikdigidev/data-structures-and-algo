package com.renaissance.recursion;
//write a program to print n natural numbers using recursion
public class Print1ToN {
    public static void main(String[] args) {
        int start = 1;
        int n = 10;
        print(start,n);
    }

    private static void print(int start, int n) {
        if (start>n) return;
        System.out.println(start);
        print(start+1,n);
    }
}
