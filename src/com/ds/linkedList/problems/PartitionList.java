package com.ds.linkedList.problems;

import com.ds.linkedList.MyLinkedList;
/*You have a singly linked list that DOES NOT HAVE A TAIL POINTER
  (which will make this method simpler to implement).
Given a value x you need to rearrange the linked list such that all nodes with a value less than x come before all nodes with a value greater than or equal to x.

Additionally, the relative order of nodes in both partitions should remain unchanged.


Constraints:

The solution should traverse the linked list at most once.

The solution should not create a new linked list.


Input:

A singly linked list and an integer x.


Output:

The same linked list but rearranged as per the above criteria.


Function signature:

public void partitionList(int x);


Details:

The function partitionList takes an integer x as a parameter and modifies the current linked list in place according to the specified criteria. If the linked list is empty (i.e., head is null), the function should return immediately without making any changes.



Example 1:

Input:

Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5

Process:

Values less than 5: 3, 2, 1

Values greater than or equal to 5: 8, 5, 10

Output:

Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10





Example 2:
Input:

Linked List: 1 -> 4 -> 3 -> 2 -> 5 -> 2 x: 3

Process:

Values less than 3: 1, 2, 2

Values greater than or equal to 3: 4, 3, 5

Output:

Linked List: 1 -> 2 -> 2 -> 4 -> 3 -> 5





Tips:

While traversing the linked list, maintain two separate chains: one for values less than x and one for values greater than or equal to x.

Use dummy nodes to simplify the handling of the heads of these chains.

After processing the entire list, connect the two chains to get the desired arrangement.



Note:

The solution must maintain the relative order of nodes. For instance, in the first example, even though 8 appears before 5 in the original list, the partitioned list must still have 8 before 5 as their relative order remains unchanged.

Note:

You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes' next pointers may be changed.)*/
public class PartitionList {
    public static void main(String[] args) {

        // Create a new LinkedList and append values to it
        MyLinkedList ll = new MyLinkedList(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.print(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.print(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }
}
