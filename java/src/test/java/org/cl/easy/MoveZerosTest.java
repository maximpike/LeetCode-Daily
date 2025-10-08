package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosTest {

    @Test
    void moveZeroes_example1() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    @Test
    void moveZeroes_example2() {
        int[] nums = {0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    void moveZeroes_example3() {
        int[] nums = {1,2,3,4};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        assertArrayEquals(new int[] {1,2,3,4}, nums);
    }

    @Test
    void moveZeroes_example4() {
        int[] nums = {0,0,0,0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        assertArrayEquals(new int[] {0,0,0,0}, nums);
    }

    @Test
    void moveZeroes_example5() {
        int[] nums = {};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}