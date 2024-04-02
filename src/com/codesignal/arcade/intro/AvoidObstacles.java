package com.codesignal.arcade.intro;

/*You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
solution(inputArray) = 4.
*/
public class AvoidObstacles {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 9};
        System.out.println(solution(arr));
    }

    static int solution(int[] inputArray) {
        int jump = 1;
        boolean fail = true;
        while (fail) {
            jump++;
            fail = false;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % jump == 0) {
                    fail = true;
                    break;
                }
            }

        }
        return jump;

    }
}
