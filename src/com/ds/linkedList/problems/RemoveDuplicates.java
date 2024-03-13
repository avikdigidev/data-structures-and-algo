package com.ds.linkedList.problems;

import com.ds.linkedList.MyLinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.print();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4

        */

    }
}
