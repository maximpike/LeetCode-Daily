package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosTest {

    // Solution 1 - Tests
    @Test
    void moveZeroes_solution1_example1() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution1(nums);
        assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    @Test
    void moveZeroes_solution1_example2() {
        int[] nums = {0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution1(nums);
        assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    void moveZeroes_solution1_example3() {
        int[] nums = {1,2,3,4};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution1(nums);
        assertArrayEquals(new int[] {1,2,3,4}, nums);
    }

    @Test
    void moveZeroes_solution1_example4() {
        int[] nums = {0,0,0,0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution1(nums);
        assertArrayEquals(new int[] {0,0,0,0}, nums);
    }

    @Test
    void moveZeroes_solution1_example5() {
        int[] nums = {};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution1(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    // Solution 2 - Tests
    @Test
    void moveZeroes_solution2_example1() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution2(nums);
        assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    @Test
    void moveZeroes_solution2_example2() {
        int[] nums = {0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution2(nums);
        assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    void moveZeroes_solution2_example3() {
        int[] nums = {1,2,3,4};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution2(nums);
        assertArrayEquals(new int[] {1,2,3,4}, nums);
    }

    @Test
    void moveZeroes_solution2_example4() {
        int[] nums = {0,0,0,0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution2(nums);
        assertArrayEquals(new int[] {0,0,0,0}, nums);
    }

    @Test
    void moveZeroes_solution2_example5() {
        int[] nums = {};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes_solution2(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}