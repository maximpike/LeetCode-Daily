package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColoursTest {

    @Test
    void sortColors_example1_solution1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example2_solution1() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example3_solution1() {
        int[] nums = {1, 0, 2};
        int[] expected = {0, 1, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example4_solution1() {
        int[] nums = {0};
        int[] expected = {0};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example5_solution1() {
        int[] nums = {1};
        int[] expected = {1};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example6_solution1() {
        int[] nums = {2};
        int[] expected = {2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example7_solution1() {
        int[] nums = {2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example8_solution1() {
        int[] nums = {1, 0, 1, 2, 1, 0, 2, 1, 0};
        int[] expected = {0, 0, 0, 1, 1, 1, 1, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example9_solution1() {
        int[] nums = {1, 0, 1, 1};
        int[] expected = {0, 1, 1, 1};
        SortColours sc = new SortColours();
        sc.sortColors_solution1(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example1_solution2() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example2_solution2() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example3_solution2() {
        int[] nums = {1, 0, 2};
        int[] expected = {0, 1, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example4_solution2() {
        int[] nums = {0};
        int[] expected = {0};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example5_solution2() {
        int[] nums = {1};
        int[] expected = {1};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example6_solution2() {
        int[] nums = {2};
        int[] expected = {2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example7_solution2() {
        int[] nums = {2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example8_solution2() {
        int[] nums = {1, 0, 1, 2, 1, 0, 2, 1, 0};
        int[] expected = {0, 0, 0, 1, 1, 1, 1, 2, 2};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors_example9_solution2() {
        int[] nums = {1, 0, 1, 1};
        int[] expected = {0, 1, 1, 1};
        SortColours sc = new SortColours();
        sc.sortColors_solution2(nums);
        assertArrayEquals(expected, nums);
    }
}