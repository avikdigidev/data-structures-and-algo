package com.gfg;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        convertToWave(n,a);
        System.out.println(Arrays.toString(a));
    }
    public static void convertToWave(int n, int[] a) {
        // code here
        for (int i=0;i<(n-1);i=i+2){
            int temp = 0;
            temp =a[i];
            a[i]=a[i+1];
            a[i+1]= temp;


        }
    }
}
