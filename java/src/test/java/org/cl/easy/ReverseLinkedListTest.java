package org.cl.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    // Input: [1,2,3,4,5] -> Output: [5,4,3,2,1]
    @Test
    void testReverseList_manyNodes() {
        // Given
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        int[] expected = {5, 4, 3, 2, 1};

        // When
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversed = rll.reverseList_solution1(head);

        // Then
        assertArrayEquals(expected, toArray(reversed));
    }

    // Input: [1,2] -> Output: [2,1]
    @Test
    void testReverseList_twoNodes() {
        // Given
        ListNode head = createLinkedList(new int[]{1, 2});
        int[] expected = {2, 1};

        // When
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversed = rll.reverseList_solution1(head);

        // Then
        assertArrayEquals(expected, toArray(reversed));
    }

    // Input: [] -> Output: []
    @Test
    void testReverseList_emptyList() {
        // Given
        ListNode head = createLinkedList(new int[]{});
        int[] expected = {};

        // When
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversed = rll.reverseList_solution1(head);

        // Then
        assertArrayEquals(expected, toArray(reversed));
    }

    // Input: [-6] -> Output: [-6]
    @Test
    void testReverseList_oneNode() {
        // Given
        ListNode head = createLinkedList(new int[]{-6});
        int[] expected = {-6};

        // When
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversed = rll.reverseList_solution1(head);

        // Then
        assertArrayEquals(expected, toArray(reversed));
    }

    private ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    // Convert linked list to array for easy comparison
    private int[] toArray(ListNode head) {
        // First pass: count length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Second pass: populate array
        int[] result = new int[length];
        curr = head;
        for (int i = 0; i < length; i++) {
            result[i] = curr.val;
            curr = curr.next;
        }
        return result;
    }
}