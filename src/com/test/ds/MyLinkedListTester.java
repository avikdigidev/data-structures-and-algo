package com.test.ds;

import com.ds.MyLinkedList;

public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(4);
        myLinkedList.append(3);
        //myLinkedList.removeLast();
        myLinkedList.prepend(1);
        //myLinkedList.removeFirst();
        System.out.println("***************************************");
        myLinkedList.get(2);
        myLinkedList.set(0, 99);
        myLinkedList.insert(0,989);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.print();
    }

}
