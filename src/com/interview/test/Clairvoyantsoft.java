package com.interview.test;

public class Clairvoyantsoft {
    public static void main(String[] args) {
        //Binary search
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 2;
        int n = arr.length - 1;
        int start = 0;
        boolean isPresent = binarySearch(arr, num, start, n);
        System.out.println(isPresent);

    }

    private static boolean binarySearch(int[] inputArray, int numberToSearch, int start, int lengthOfArray) {
     /*   int[] left = new int[lengthOfArray/2];
        int[] right = new int[lengthOfArray/2];*/

        int end = lengthOfArray;
        while (start < end) {
            if (numberToSearch == inputArray[start]) {
                return true;
            }
            /*1, 2, 3, 4, 5, 6 > start =0, end = arr.length
             * 2
             * 2<3 start = 1
             * 1, 2, 3, 4, 5, 6
             * 2
             * 1
             * no change in end
             *
             *
             * */
            if (numberToSearch <= inputArray[lengthOfArray / 2]) {
                end = lengthOfArray / 2 - 1;

                binarySearch(inputArray, numberToSearch, start, end);
            } else {
                start = (lengthOfArray / 2) + 1;
                binarySearch(inputArray, numberToSearch, start, end);

            }
//8 queen in DS
        }
        return false;

    }
}
