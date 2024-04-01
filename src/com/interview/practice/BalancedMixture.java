package com.interview.practice;

public class BalancedMixture {
    /*Balanced mixture
     You are working in the resources allocation team.
     You have A number of powerful resources and B number of weak resources.
     You have to select a balanced mixture of these resources.
     A balanced mixture has C resources containing no less than 4 powerful resources and no less than one weak resource.
     You are given Integers A, B, and C.
     Note; Each powerful and weak resource is unique in Itself.
     Hence, two mixtures with the same number of powerful and weak resources are considered different
     If at least one of the resources is different in the 2 mixtures.
     Task Print the number of ways of selecting a balanced mixture with the given number of resources.
     Example Assumptions A=4 B=3 C=5
     Approach Let the 4 powerful resources as A1, A2, A3, A4 Let the 3 weak resources as B1, B2, B3
     The various ways of selecting a balanced mixture are
        1. A1, A2, A3, A4, B1
        2. A1, A2, A3, A4, B2
        3. A1, A2, A3, A4, B3
     Hence, the answer is 3.

     Function description

     Complete the function powerLimit() which takes an Integer A and an integer B.
     This function takes the following 33 parameters and returns the required answer:
     A: Represents the number of powerful resources
     B: Represents the number of weak resources
     C. Represents the number of resources in a balanced mixture Input format
     Note: This is the input format you must use to provide custom input (available above the Compile and Test button).
     The first line contains an integer A denoting the number of powerful resources.
     The second line contains an integer B denoting the number of weak resources.
     The third line contains an Integer C denoting the number of resources in a balanced mixture.
     Output format Print the number of ways of selecting a balanced mixture with the given number of resources.
     Input 4 1 5
     Output 1
     Explanation
      Given • A = 4 • B=1 C=5
      Approach Let the 4 powerful resources as \(A_1, A_2. A_A_41)
      Let the weak resource as \(B_1\)
      The only way to select a balanced mixture is: 1. (A_1, A2, A3, A4, B_11)
      Hence, the answer is 1.
      */
    public static void main(String[] args) {
        int a=4,b=3,c=6;
        int result = powerLimit(a,b,c);
        System.out.println(result);
    }

    private static int powerLimit(int a, int b, int c) {
        int result =0;
        int waysForA = factorial(a)/(factorial(a-4)*factorial(4));
        int waysForB = factorial(b)/(factorial(b-1)*factorial(1));
        result = waysForA*waysForB;

        if(c>5){
            int additionalWeakResources = c - 5;
            result *= (b - additionalWeakResources);
        }
        return result;
    }

    private static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *=i;
        }
        return result;
    }
}
