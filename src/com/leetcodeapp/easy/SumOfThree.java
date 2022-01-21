package com.leetcodeapp.easy;

import java.util.Arrays;

/*Given an array of n integers, there are 3 elements a,b and c
 * such that a+b+c=0
 * find all unique triplets in the array which gives the sum of zero*/
public class SumOfThree {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int[][] result = sumOfThree(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[][] sumOfThree(int[] arr) {
        if (arr.length == 0) return new int[0][0];
        int n = arr.length;
        int[][] result = new int[n][n];

        //sort the array

        for (int i = 0; i < n-2; i++) {
            if (arr[i] > 0){ //sum cannot be 0 since arr[i] is 0 already
                break;
            }
            if (i>0 && arr[i] == arr[i-1]){ //skip duplicates
                continue;
            }
            //similar to Two sum we are to find ints that sum to a target
            int j = i+1; //starts after i
            int k = n-1; //ends at the end of the array
            while (j<k){
                if (arr[i] +arr[j]>0){break;}
                if(j> i+1&&arr[j] == arr[j-1]){ //skip duplicates
                    j++;
                    continue;
                }
                if (arr[i] +arr[j]+ arr[k] >0){k--;}
                else if (arr[i] +arr[j]+ arr[k] <0){j++;}

                else{
                    int[] res = {arr[i], arr[j], arr[k]};
                    result[i] = res;
                    j++;k--;
                }
            }
        }


        return result;

    }

}
