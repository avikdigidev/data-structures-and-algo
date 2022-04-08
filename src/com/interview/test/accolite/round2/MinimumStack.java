package com.interview.test.accolite.round2;

import java.util.Stack;

// TODO without doing any iteration add, delete and min in O(1) maybe by stack
public class MinimumStack {

    public Stack<Integer> numStack = new Stack<Integer>();
    public Stack<Integer> minStack = new Stack<Integer>();

    public static void main(String[] args) {
        MinimumStack ms = new MinimumStack();
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(1);
        ms.push(-1);
        ms.push(8);

        System.out.println(ms.getMinimum());
    }

    public void push(int data) {
        if (numStack.isEmpty()) {
            System.out.println("data inserted: "+data);
            numStack.push(data);
            minStack.push(data);
        } else {
            System.out.println("*************************"+data+"*************************");
            if (data >= minStack.peek()) {
                System.out.println("data inserted is greater than min: "+data);
                numStack.push(data);
                System.out.println("min uncahged:"+ minStack.peek());
            } else {
                System.out.println("2*data-min inserted is less than min: "+data);
                numStack.push(2 * data - minStack.peek());

                minStack.push(data);
                System.out.println("min updated:"+ data);
            }
        }
    }

    public int pop() {
        if (numStack.isEmpty()) {
            return -1;
        } else {
            int curr = numStack.pop();
            if (curr >= minStack.peek()) {
                System.out.println("Min unchanged :" + minStack.peek() + " after removing: " + curr);
            } else {

                minStack.push(2 * minStack.peek() - curr);
                System.out.println("min updated:"+ minStack.peek());
            }
            return curr;
        }

    }

    public int getMinimum() {
        System.out.println("Min :" + minStack.peek());
        return minStack.peek();
    }


}
