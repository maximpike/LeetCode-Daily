package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge_example1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = nums2.length;
        int[] expected = {1, 2, 2, 3, 5, 6};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = nums2.length;
        int[] expected = {1};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = nums2.length;
        int[] expected = {1};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example4() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {7, 8, 9};
        int m = 3;
        int n = nums2.length;
        int[] expected = {1, 2, 3, 7, 8, 9};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example5() {
        int[] nums1 = {1, 2, 4, 5, 6, 0};
        int m = 5;
        int[] nums2 = {3};
        int n = nums2.length;
        int[] expected = {1, 2, 3, 4, 5, 6};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example6() {
        int[] nums1 = {7, 8, 9, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = nums2.length;
        int[] expected = {1, 2, 3, 7, 8, 9};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge_example7() {
        int[] nums1 = {1, 21, 88, 0, 0, 0};
        int[] nums2 = {2, 17, 32};
        int m = 3;
        int n = nums2.length;
        int[] expected = {1, 2, 17, 21, 32, 88};

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge_solution1(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}