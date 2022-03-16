package com.codesignal.arcade.intro;
/*
* Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
* each statue having an non-negative integer size. Since he likes to make things perfect,
* he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
* He may need some additional statues to be able to accomplish that.
* Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer statues

An array of distinct non-negative integers.

Guaranteed constraints:
1 ≤ statues.length ≤ 10,
0 ≤ statues[i] ≤ 20.

The minimal number of statues that need to be added to existing statues such that
it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.
* */
public class ArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues= {6, 2, 1, 8};
        int max=Integer.MIN_VALUE;
        int min=statues[0];
        int n = statues.length;
        for (int statue : statues) {
            max = Math.max(statue, max);
            min = Math.min(statue, min);
        }

        System.out.print(max-min-n+1);
    }
}
