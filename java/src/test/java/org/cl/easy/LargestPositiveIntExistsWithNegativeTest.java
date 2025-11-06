package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPositiveIntExistsWithNegativeTest {

    @Test
    void findMaxK_example1() {
        int[] nums = {-1, 2, -3, 3};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(3, l.findMaxK_solution1(nums));
        assertEquals(3, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example2() {
        int[] nums = {-1, 10, 6, 7, -7, 1};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(7, l.findMaxK_solution1(nums));
        assertEquals(7, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example3() {
        int[] nums = {-10, 8, 6, 7, -2, -3};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(-1, l.findMaxK_solution1(nums));
        assertEquals(-1, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example4() {
        int[] nums = {-10, -9, -3, 1, 2, 3, 7, 8};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(3, l.findMaxK_solution1(nums));
        assertEquals(3, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example5() {
        int[] nums = {1, 2, 3, 4};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(-1, l.findMaxK_solution1(nums));
        assertEquals(-1, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example6() {
        int[] nums = {-1, -2, -3, -4, -5, -6, -10};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(-1, l.findMaxK_solution1(nums));
        assertEquals(-1, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example7() {
        int[] nums = {-1, 1};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(1, l.findMaxK_solution1(nums));
        assertEquals(1, l.findMaxK_solution2(nums));
    }

    @Test
    void findMaxK_example8() {
        int[] nums = {-9,-43,24,-23,-16,-30,-38,-30};
        LargestPositiveIntExistsWithNegative l = new LargestPositiveIntExistsWithNegative();
        assertEquals(-1, l.findMaxK_solution1(nums));
        assertEquals(-1, l.findMaxK_solution2(nums));
    }
}