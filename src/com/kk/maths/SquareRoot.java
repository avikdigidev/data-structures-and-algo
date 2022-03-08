package com.kk.maths;

//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        int precision = 3;
        getBinarySearchSquareRoot(num, precision); //T.C:   O(Log(n))
       getSquareRootRepeatedSubtractionMethod(num);
       getSquareRootNewtonRaphsonApproach(num);


    }

    private static double getSquareRootNewtonRaphsonApproach(int num) {
        double x = num;
        double root ;
        while(true){
            root = 0.5*(x+(num/x));
            if (Math.abs(root-x)<0.55){
                break;
            }
            x=root;
        }
        System.out.println(root);
        return root;
    }

    private static double getBinarySearchSquareRoot(int num, double precision) {
        int start = 0;
        int end = num;
        double root = 0.000;
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (midPoint*midPoint==num){
                return midPoint;
            }
            if (midPoint*midPoint>num){
                end = midPoint-1;
            }else{
                start = midPoint+1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root*root<=num){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        System.out.println(root);
        return root;
    }

    private static int getSquareRootRepeatedSubtractionMethod(int num) {
        int num2 = num;
        int result = 0;
        for (int i = 1; i <= num2; i += 2) {
            if (i > num) return result;
            num = num - i;
            result++;
            if (num == 0) {
                return result;
            }
        }
        System.out.println(result);
        return result;
    }
}
