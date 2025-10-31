package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresSortedArrayTest {

    @Test
    void sortedSquares_example1() {
        int[] nums = {-4, -1, 0, 3, 10};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, ssa.sortedSquares_solution2(nums));
    }

    @Test
    void sortedSquares_example2() {
        int[] nums = {-7, -3, 2, 3, 11};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, ssa.sortedSquares_solution2(nums));
    }

    @Test
    void sortedSquares_example3() {
        int[] nums = {-11, -8, -5, -3, 0};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(new int[]{0, 9, 25, 64, 121}, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(new int[]{0, 9, 25, 64, 121}, ssa.sortedSquares_solution2(nums));
    }

    @Test
    void sortedSquares_example4() {
        int[] nums = {0, 1, 2, 3, 5, 8, 11, 15};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(new int[]{0, 1, 4, 9, 25, 64, 121, 225}, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(new int[]{0, 1, 4, 9, 25, 64, 121, 225}, ssa.sortedSquares_solution2(nums));
    }

    @Test
    void sortedSquares_example5() {
        int[] nums = {0};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(new int[]{0}, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(new int[]{0}, ssa.sortedSquares_solution2(nums));
    }

    @Test
    void squareArray_example6() {
        int[] nums = {-2, -2, 2, 2};
        int[] expected = {4, 4, 4, 4};
        SquaresSortedArray ssa = new SquaresSortedArray();
        assertArrayEquals(expected, ssa.sortedSquares_solution1(nums));
        assertArrayEquals(expected, ssa.sortedSquares_solution2(nums));
    }
}