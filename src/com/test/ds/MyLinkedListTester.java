package com.test.ds;

import com.ds.MyLinkedList;

public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(4);
        myLinkedList.append(3);
        myLinkedList.removeLast();
        myLinkedList.prepend(1);
myLinkedList.removeFirst();
        System.out.println("***************************************");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.print();
    }

}