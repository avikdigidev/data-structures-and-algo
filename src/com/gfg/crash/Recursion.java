package com.gfg.crash;

public class Recursion {
    public static void main(String[] args) {
        int sum = sumOfDigits(10);
        System.out.println(sum);
        int ropeCut = cutRope(9, 2, 2, 1);
        System.out.println(ropeCut);
        String s = "abc";
        getSubsets(s, "", 0);
        towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println("Factorial: " + factorial(0));
        System.out.println("Counter: " + countTotalDigits(9999));
        System.out.println("Sum of digits: " + sumOfDigits(9999));
        System.out.println("Recursive sum: " + recursiveSum(5));
        printNos(64);
        System.out.println("Fibbonaci number at nth place" + getFibonacciNumber(10));
        System.out.println("Sequence number at nth place" + theSequence(3));
        System.out.println("nCr: " + nCr(5, 2));
        System.out.println("Is palindrome: " + isPalin(221));
        System.out.println("GCD: " + getGCD(15, 10));
        int[] arr = {1, 2, 3, 4, 5};
        printArrayRecursively(arr, arr.length);
        long toh = toh(3, 'A', 'C', 'B');
        System.out.println("total moves : "+toh);
        int num= 2;
        int power=2;
        System.out.println("recursive power: "+ recursivePower(num,power));
    }

    private static int recursivePower(int n, int p) {
        if (p==1) return n;
        if (p==0) return 1;
        return n*recursivePower(n,p-1);
    }

    public static long toh(int N, char from, char to, char aux) {
        long moves = 0L;
        if (N >= 1) {
            // recursive call to move top disk from "from" to aux in current call
            moves = moves + toh(N - 1, from, aux, to);
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            //increment moves
            moves++;
            // recursive call to move top disk from aux to "to" in current call
            moves = moves + toh(N - 1, aux, to, from);

        }
        return moves;
    }

    public static void printArrayRecursively(int arr[], int n) {
        if (n == 0) {
            return;
        }
        System.out.print(arr[arr.length - n] + " ");
        printArrayRecursively(arr, n - 1);
    }

    private static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) return max;
        return getGCD(min, max % min);
    }

    private static boolean isPalin(int N) {
        return isPalinHelper(N, N, 0);
    }

    private static boolean isPalinHelper(int orig, int n, int r) {
        if (n == 0) {
            return orig == r;
        }
        int digit = n % 10;
        r = r * 10 + digit;
        return isPalinHelper(orig, n / 10, r);
    }

    private static int nCr(int n, int r) {
        if (r == 0 || n == r) {
            return 1; // Base case: nCr = 1 when r is 0 or n
        } else {
            return nCr(n - 1, r - 1) + nCr(n - 1, r); // Recursive case: nCr = (n-1)C(r-1) + (n-1)Cr
        }
    }

    private static int theSequence(int N) {
        if (N == 0) return 1;
        return N + N * theSequence(N - 1);
    }

    private static int getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }

    private static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static void printNos(int N) {
        if (N == 0) return;
        printNos(N - 1);
        System.out.println(N);
    }

    private static int countTotalDigits(int n) {

        if (n < 10) {
            return 1;
        }

        return countTotalDigits(n / 10) + 1;


    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        towerOfHanoi(n - 1, b, a, c);
    }

    private static void getSubsets(String s, String curr, int index) {
        if (index == s.length()) {
            System.out.println(curr);
            return;
        }
        getSubsets(s, curr, index + 1);
        getSubsets(s, curr + s.charAt(index), index + 1);

    }

    private static int cutRope(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n < 0) return -1;
        int result = Math.max(Math.max(cutRope(n - a, a, b, c), cutRope(n - b, a, b, c)), cutRope(n - c, a, b, c));
        if (result == -1) {
            return -1;
        }
        return result + 1;


    }

    private static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
