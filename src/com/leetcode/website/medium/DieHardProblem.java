package com.leetcode.website.medium;

//https://leetcode.com/problems/water-and-jug-problem/
public class DieHardProblem {
    public static void main(String[] args) {
/*Bézout's identity (also called Bézout's lemma) is a theorem in the elementary theory of numbers:

let a and b be nonzero integers and let d be their greatest common divisor. Then there exist integers x
and y such that ax+by=d
In addition, the greatest common divisor d is the smallest positive integer that can be written as ax + by
every integer of the form ax + by is a multiple of the greatest common divisor d.
*/
        int jug1=5;int jug2=3;
        int target=4;
        System.out.println(canMeasureWater(jug1,jug2,target));
    }

    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        //limit brought by the statement that water is finally in one or both buckets
        if (jug1Capacity + jug2Capacity < targetCapacity) return false;
        //case x or y is zero
        if (jug1Capacity == targetCapacity || jug2Capacity == targetCapacity || jug1Capacity + jug2Capacity == targetCapacity)
            return true;
        return targetCapacity%gcd(jug1Capacity,jug2Capacity)==0;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
