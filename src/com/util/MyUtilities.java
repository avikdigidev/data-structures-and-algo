package com.util;

public class MyUtilities {
    public static int getMax(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        } else if (val1 < val2){
            return val2;
        }else{
            return val1;
        }
    }

    public static int getMin(int val1, int val2) {
        if (val1 < val2) {
            return val1;
        } else if (val1 > val2) {
            return val2;
        }else{
            return val1;
        }
    }
}
