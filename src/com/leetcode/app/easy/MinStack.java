package com.leetcode.app.easy;

import java.util.Stack;

public class MinStack {

    public Stack<Integer> numStack = new Stack<Integer>();
    public Stack<Integer> minimumStack = new Stack<Integer>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
       minStack.push(3);
       minStack.push(1);
        System.out.println(minStack.min());
       minStack.push(5);
       minStack.push(7);
        System.out.println(minStack.min());
       minStack.push(0);
       minStack.push(8);

        System.out.println(minStack.min());
    }

    private int min() {
        return minimumStack.peek();
    }

    private void push(int data) {
        if (numStack.isEmpty()){
            numStack.push(data);
            minimumStack.push(data);
        }else{
            if (data >= minimumStack.peek()){
                numStack.push(data);
            }else{
                numStack.push(2*data - minimumStack.peek());
                minimumStack.push(data);
            }
        }
    }

    private int pop(){
        if (numStack.isEmpty()){
            return -1;
        }else{
            int current = numStack.pop();
            if (current <= minimumStack.peek()){
                minimumStack.push(2* minimumStack.peek()-current);
            }
            return current;
        }
    }

}
