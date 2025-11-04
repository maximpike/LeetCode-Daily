package org.cl.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDiffOfTwoArraysTest {

    @Test
    void findDifference_example1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> expected = List.of(
                List.of(1, 3),
                List.of(4, 6)
        );
        FindDiffOfTwoArrays findDiffOfTwoArrays = new FindDiffOfTwoArrays();
        assertEquals(expected, findDiffOfTwoArrays.findDifference(nums1, nums2));
    }

    @Test
    void findDifference_example2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of()
        );
        FindDiffOfTwoArrays findDiffOfTwoArrays = new FindDiffOfTwoArrays();
        assertEquals(expected, findDiffOfTwoArrays.findDifference(nums1, nums2));
    }

    @Test
    void findDifference_example3() {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 1, 1};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of()
        );
        FindDiffOfTwoArrays findDiffOfTwoArrays = new FindDiffOfTwoArrays();
        assertEquals(expected, findDiffOfTwoArrays.findDifference(nums1, nums2));
    }

    @Test
    void findDifference_example4() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8)
        );
        FindDiffOfTwoArrays findDiffOfTwoArrays = new FindDiffOfTwoArrays();
        assertEquals(expected, findDiffOfTwoArrays.findDifference(nums1, nums2));
    }
}