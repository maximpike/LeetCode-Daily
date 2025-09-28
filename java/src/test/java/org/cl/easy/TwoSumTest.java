package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum_example1() {
        // inputs
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        TwoSum ts = new TwoSum();
        assertArrayEquals(expected, ts.twoSum_solution1(input, target));
        assertArrayEquals(expected, ts.twoSum_solution2(input, target));
    }

    @Test
    void twoSum_example2() {
        // inputs
        int[] input = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};

        TwoSum ts = new TwoSum();
        assertArrayEquals(expected, ts.twoSum_solution1(input, target));
        assertArrayEquals(expected, ts.twoSum_solution2(input, target));
    }

    @Test
    void twoSum_example3() {
        // inputs
        int[] input = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};

        TwoSum ts = new TwoSum();
        assertArrayEquals(expected, ts.twoSum_solution1(input, target));
        assertArrayEquals(expected, ts.twoSum_solution2(input, target));
    }

    @Test
    void twoSum_example4() {
        // inputs
        int[] input = new int[]{4, -2, 5, 0, 6, 3, 2, 7};
        int target = 1;
        int[] expected = new int[]{1, 5};

        TwoSum ts = new TwoSum();
        assertArrayEquals(expected, ts.twoSum_solution1(input, target));
        assertArrayEquals(expected, ts.twoSum_solution2(input, target));
    }
}