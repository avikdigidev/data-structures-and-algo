package com.ds.linkedList.problems;

import com.ds.linkedList.MyLinkedList;

import java.util.LinkedList;

public class FindMiddleNode {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);


        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode());


        myLinkedList.append(6);


        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode());


        /*
            EXPECTED OUTPUT:
            ----------------
            1 -> 2 -> 3 -> 4 -> 5
            Middle Node: 3
            ===========================
            1 -> 2 -> 3 -> 4 -> 5 -> 6
            Middle Node: 4

        */

    }
}
