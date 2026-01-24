package org.cl.easy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void testSearchInsert_example1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(2, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(1, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(4, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example4() {
        int[] nums = {1, 3, 4, 5, 7, 8};
        int target = 2;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(1, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example5() {
        int[] nums = {1, 3, 4, 5, 7, 8};
        int target = 3;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(1, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example6() {
        int[] nums = {1, 3, 4, 5, 7, 8};
        int target = 4;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(2, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_example7() {
        int[] nums = {1, 3, 4, 5, 7, 8};
        int target = 5;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(3, sip.searchInsert(nums, target));
    }

    @Test
    void testSearchInsert_minInsertIndex() {
        int[] nums = {-21, -13, -8, -5, -2, 0};
        int target = -22;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(0, sip.searchInsert(nums, target));

    }

    @Test
    void testSearchInsert_maxInsertIndex() {
        int[] nums = {0, 21, 25, 44, 56, 61, 62, 63};
        int target = 64;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(8, sip.searchInsert(nums, target));
    }

    // TODO: update test to big array with insertion index at upper index of array size
    @Test
    void testSearchInsert_integerOverflow() {
        int[] nums = {0, 21, 25, 44, 56, 61, 62, 63};
        int target = 64;
        SearchInsertPosition sip = new SearchInsertPosition();
        assertEquals(8, sip.searchInsert(nums, target));
    }
}