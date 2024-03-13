package com.ds.linkedList;


import java.util.HashSet;
import java.util.Set;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        System.out.println("Head: " + head.value);
        return head;
    }

    public Node getTail() {
        System.out.println("Tail: " + tail.value);
        return tail;
    }

    public void getLength() {
        System.out.println("length: " + length);
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;

        Node pre = head;
        Node temp = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node prev = get(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        length++;
        return true;
    }


    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        } else if (index == 0) {
            removeFirst();
        } else if (index == length - 1) {
            removeLast();
        } else {
            Node prev = get(index - 1);
            Node temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
        return null;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
    }

    public void reverse() {
        if (head == null || head.next == null) {
            // If the list is empty or has only one node, no need to reverse
            return;
        }

        Node before = null;
        Node current = head;
        Node after;

        while (current != null) {
            after = current.next; // Store the next node
            current.next = before; // Reverse the pointer
            before = current; // Move before pointer one step ahead
            current = after; // Move current pointer one step ahead
        }

        // After the loop, 'before' will point to the new head of the reversed list
        tail = head; // Update the tail to point to the previous head
        head = before; // Update the head to point to the last node, which is the new head

    }

    public int findMiddleNode() {
        /*
         * In this problem, you should use the slow and fast pointer technique (also known as Floyd's Tortoise and Hare algorithm)
         *  to find the middle element of the linked list efficiently.
         * The key idea is to have two pointers, one that moves twice as fast as the other.
         * By the time the fast pointer reaches the end of the linked list, the slow pointer will be at the middle.
         *
         * */
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public int findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow.value;
    }
    public void partitionList(int x) {
        // Step 1: Check for an empty list.
        // If the list is empty, there is nothing
        // to partition, so we exit the method.
        if (head == null) return;

        // Step 2: Create two dummy nodes.
        // These dummy nodes act as placeholders
        // to simplify list manipulation.
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        // Step 3: Initialize pointers for new lists.
        // 'prev1' and 'prev2' will track the end nodes of
        // the two lists that are being created.
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        // Step 4: Start with the head of the original list.
        Node current = head;

        // Step 5: Iterate through the original list.
        while (current != null) {

            // Step 6: Compare current node value with 'x'.
            // Nodes are partitioned based on their value
            // being less than or greater than/equal to 'x'.

            // Step 6.1: If value is less than 'x',
            // add node to the first list.
            if (current.value < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                // Step 6.2: If value is greater or equal,
                // add node to the second list.
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }

            // Move to the next node in the original list.
            current = current.next;
        }

        // Step 7: Terminate the second list.
        // This prevents cycles in the list.
        prev2.next = null;

        // Step 8: Connect the two lists.
        // The first list is followed by the second list.
        prev1.next = dummy2.next;

        // Step 9: Update the head of the original list.
        // The head now points to the start of the first list.
        head = dummy1.next;
    }
    public void removeDuplicates() {
        Node prev= null;
        Node current = head;
        Set<Integer> set = new HashSet<>();

        while(current!=null){
            if (set.contains(current.value)){
                prev.next = current.next;
                length--;
            }else{
                set.add(current.value);
                prev=current;

            }
            current = current.next;
        }


    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
