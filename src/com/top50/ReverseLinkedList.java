package com.top50;

public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){this.data = data; this.next = null;}
        Node(int data, Node next){this.data = data; this.next = next;}
    }

    static class LinkedList{
        Node head;
        LinkedList(){this.head = null;}
        LinkedList(Node head){this.head = head;}
    }

    static void reverseList(LinkedList list){
        Node previous = null;
        Node current = list.head;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        list.head = previous;
    }
}
