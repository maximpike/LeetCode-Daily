package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchExample1() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        assertEquals(4, bs.search(nums, target));
    }

    @Test
    void searchExample2() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        assertEquals(-1, bs.search(nums, target));
    }

    @Test
    void searchTargetWithMinArrayValue() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-3000, -163, -1, 0, 10, 498, 1004, 6789, 7012, 9000};
        int target = -3000;
        assertEquals(0, bs.search(nums, target));
    }

    @Test
    void searchTargetWithMaxArrayValue() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-3000, -163, -1, 0, 10, 498, 1004, 6789, 7012, 9000};
        int target = 9000;
        assertEquals(9, bs.search(nums, target));
    }

    @Test
    void searchNoTargetWithMinArrayValue() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-3000, -163, -1, 0, 10, 498, 1004, 6789, 7012, 9000};
        int target = -3001;
        assertEquals(-1, bs.search(nums, target));
    }

    @Test
    void searchNoTargetWithMaxArrayValue() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-3000, -163, -1, 0, 10, 498, 1004, 6789, 7012, 9000};
        int target = 9001;
        assertEquals(-1, bs.search(nums, target));
    }
}