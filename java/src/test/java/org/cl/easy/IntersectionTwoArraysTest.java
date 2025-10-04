package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTwoArraysTest {

    @Test
    void intersection_example1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionTwoArrays intersectionTwoArrays = new IntersectionTwoArrays();
        assertArrayEquals(new int[]{2}, intersectionTwoArrays.intersection(nums1, nums2));
    }

    @Test
    void intersection_example2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionTwoArrays intersectionTwoArrays = new IntersectionTwoArrays();
        assertArrayEquals(new int[]{4, 9}, intersectionTwoArrays.intersection(nums1, nums2));
    }
}