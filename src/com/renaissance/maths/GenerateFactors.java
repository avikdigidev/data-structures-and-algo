package com.renaissance.maths;

public class GenerateFactors {
    public static void main(String[] args) {
        int n = 34;
        int range = (int) Math.sqrt(34); //runtime complexity = O(Math.sqrt(n))
        for (int i = 1; i <=range; i++) {
            if (n%i==0){
                System.out.println(i +" "+n/i);
            }else{
                System.out.println("no");
            }

        }
    }
}
