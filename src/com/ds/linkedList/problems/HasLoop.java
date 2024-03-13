package com.ds.linkedList.problems;

import com.ds.linkedList.MyLinkedList;

import java.util.LinkedList;

public class HasLoop {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
      //  myLinkedList.getTail().next = myLinkedList.getHead().next;


        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());


        /*
            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */

    }
}
