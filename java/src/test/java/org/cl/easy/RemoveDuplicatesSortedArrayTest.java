package org.cl.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedArrayTest {

    @Test
    void removeDuplicates_example1() {
        int[] nums = {1, 1, 2};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(2, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeDuplicates_example2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(5, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeDuplicates_example3() {
        int[] nums = {-2, -1, 0, 1, 2};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(5, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeDuplicates_example4() {
        int[] nums = {1, 2, 3, 4, 4};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(4, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeDuplicates_example5() {
        int[] nums = {1};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(1, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeDuplicates_example6() {
        int[] nums = {};
        RemoveDuplicatesSortedArray duplicateSortedArray = new RemoveDuplicatesSortedArray();
        assertEquals(0, duplicateSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}