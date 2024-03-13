package com.gfg;

public class WaveArray {
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
