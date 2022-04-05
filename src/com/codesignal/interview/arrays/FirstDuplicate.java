package com.codesignal.interview.arrays;

/*
* Given an array a that contains only numbers in the range from 1 to a.length,
* find the first duplicate number for which the second occurrence has the minimal index.
* In other words, if there are more than 1 duplicated numbers,
* return the number for which the second occurrence has a smaller index,
* than the second occurrence of the other number does.
* If there are no such elements, return -1.

Example
For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.

There are 2 duplicates: numbers 2 and 3.
* The second occurrence of 3 has a smaller index than the second occurrence of 2 does,
* so the answer is 3.

For a = [2, 2], the output should be solution(a) = 2;

For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.

* Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ a.length.
*/
public class FirstDuplicate {

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5, 3, 2};
        int result2 = bruteForce(array);
        System.out.println(result2);
        int result = mostEfficient(array);
        System.out.println(result);
    }

    private static int bruteForce(int[] array) {
        int minIndexOfDuplicate = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    minIndexOfDuplicate = Math.min(minIndexOfDuplicate, j);
                }
            }
        }
        if (minIndexOfDuplicate == array.length) {
            return -1;
        } else {
            return array[minIndexOfDuplicate];
        }
    }

    public static int mostEfficient(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i]) - 1] < 0) {
                return Math.abs(a[i]);
            }
            a[Math.abs(a[i]) - 1] *= -1;
        }
        return -1;
    }

}


