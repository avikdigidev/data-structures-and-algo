package com.turing.practice;

import java.util.Stack;
//https://leetcode.com/problems/baseball-game/
public class BaseballGame {
    public static void main(String[] args) {
        //  String[] ops = {"5", "2", "C", "D", "+"}; //expected 30
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"}; //27
        int result = calculatePoints(ops);
        System.out.println(result);
    }

    private static int calculatePoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String s : ops) {
            if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (s.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(b + a);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        int result=0;
        for (Integer i:stack
             ) {
            result+=i;
        }
        return result;
    }
}
