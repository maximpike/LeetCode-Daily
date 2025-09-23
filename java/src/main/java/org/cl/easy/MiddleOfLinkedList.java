package org.cl.easy;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MiddleOfLinkedList {

    public ListNode middleNode_solution1(ListNode head) {

        ArrayList<ListNode> array = new ArrayList<>();
        int length = 0;
        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        return array.get(length / 2);
    }
    // Time complexity = O(n)
    // Space complexity = O(n)

    public ListNode middleNode_solution2(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) { // 3 1 2 7 7
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
    // Time Complexity = O(n)
    // Space Complexity = O(1)
}


