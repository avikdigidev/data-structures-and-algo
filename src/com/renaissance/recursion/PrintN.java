package com.renaissance.recursion;
//write a program to print n natural numbers using recursion
public class PrintN {
    public static void main(String[] args) {
        int start = 1;
        int n = 10;
     //   print1ToN(start,n);
     //   printNTo1(n);
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n<1) return;
        print1ToN(n-1);
        System.out.println(n);

    }

    private static void printNTo1( int n) {
        if(n<1) return;
        System.out.println(n);
        printNTo1(n-1);
    }

    private static void print1ToN(int start, int n) {
        if (start>n) return;
        System.out.println(start);
        print1ToN(start+1,n);
    }

}
