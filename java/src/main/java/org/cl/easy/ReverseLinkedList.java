package org.cl.easy;

public class ReverseLinkedList {

    // ---------------------- SOLUTION 1 - Iterative -----------------------------//
    public ListNode reverseList_solution1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    // Time complexity = O(n)
    // Space complexity = O(1)
}
