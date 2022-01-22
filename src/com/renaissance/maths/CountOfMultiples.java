package com.renaissance.maths;

/*For a given N, and integer a,b.
 * find the count of elements [1,2,3....N] which are atleast divisible
 * by a or b
 * */
public class CountOfMultiples {
    public static void main(String[] args) {
        int n = 20;
        int a = 2, b = 3;
        int count = getCountOfMultiples(n, a, b);
        System.out.println(count);
    }

    private static int getCountOfMultiples(int n, int a, int b) {
        int lcm = getLCM(a, b);
        int count = n / a + n / b - n / (lcm);
        return count;
    }

    private static int getLCM(int a, int b) {
        int lcm = 0;
        int gcd = getGCD(a, b);
        lcm = (a * b) / gcd;
        return lcm;
    }

    private static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) return max;
        while (max % min != 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return min;
    }
}
