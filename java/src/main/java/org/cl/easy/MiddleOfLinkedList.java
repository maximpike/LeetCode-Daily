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

    // ---------------------- SOLUTION 1 -----------------------------//
    public ListNode middleNode_solution1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Time Complexity = O(n/2) = O(n)
    // Space Complexity = O(1)

    // ---------------------- SOLUTION 2 -----------------------------//
    public ListNode middleNode_solution2(ListNode head) {
        if (head == null) {
            return null;
        }

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

}


