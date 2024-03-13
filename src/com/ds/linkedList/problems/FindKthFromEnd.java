package com.ds.linkedList.problems;

import com.ds.linkedList.MyLinkedList;

import java.util.LinkedList;

public class FindKthFromEnd {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k);

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

    }
}
