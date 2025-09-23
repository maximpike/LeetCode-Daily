package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfLinkedListTest {

    @Test
    void middleNode_singleNod() {
        ListNode head = new ListNode(1);
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        assertSame(head, ml.middleNode_solution1(head));
        assertSame(head, ml.middleNode_solution2(head));
    }

    @Test
    void middleNode_twoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        assertSame(head.next, ml.middleNode_solution1(head));
        assertSame(head.next, ml.middleNode_solution2(head));
    }

    @Test
    void middleNode_threeNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        assertSame(head.next, ml.middleNode_solution1(head));
        assertSame(head.next, ml.middleNode_solution2(head));
    }

    @Test
    void middleNode_fourNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        assertSame(head.next.next, ml.middleNode_solution1(head));
        assertSame(head.next.next, ml.middleNode_solution2(head));
    }

    @Test
    void middleNode_elevenNodes() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 11; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        ListNode expected = head;
        for (int i = 1; i < 6; i++) {
            expected = expected.next;
        }
        assertSame(expected, ml.middleNode_solution1(head));
    }
}