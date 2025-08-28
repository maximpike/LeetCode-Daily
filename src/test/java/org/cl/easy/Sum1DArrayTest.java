package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Sum1DArrayTest {

    Sum1DArray s;

    @BeforeEach
    void setUp() {
        s = new Sum1DArray();
    }

    @Test
    void testSum1DArray() {
        int[] inputArray1x1 = s.runningSum(new int[]{1});
        int[] inputArray1x2 = s.runningSum(new int[]{1, 2});
        int[] inputArray1x3 = s.runningSum(new int[]{1, 2, 3});
        int[] inputArray1x4 = s.runningSum(new int[]{1, 2, 3, 4});
        int[] expectedArray1x1 = new int[]{1};
        int[] expectedArray1x2 = new int[]{1, 3};
        int[] expectedArray1x3 = new int[]{1, 3, 6};
        int[] expectedArray1x4 = new int[]{1, 3, 6, 10};
        assertArrayEquals(expectedArray1x1, inputArray1x1);
        assertArrayEquals(expectedArray1x2, inputArray1x2);
        assertArrayEquals(expectedArray1x3, inputArray1x3);
        assertArrayEquals(expectedArray1x4, inputArray1x4);
    }

    @Test
    void testSum1DArray_forExample1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        assertArrayEquals(expected, s.runningSum(input));
    }

    @Test
    void testSum1DArray_forExample2() {
        int[] input = new int[]{1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, s.runningSum(input));
    }

    @Test
    void testSum1DArray_forExample3() {
        int[] input = new int[]{3, 1, 2, 10, 1};
        int[] expected = new int[]{3, 4, 6, 16, 17};
        assertArrayEquals(expected, s.runningSum(input));
    }

    @Test
    void testSum1DArray_forMinValues() {
        int[] input = new int[]{-1_000_000};
        int[] expected = new int[]{-1_000_000};
        assertArrayEquals(expected, s.runningSum(input));
    }

    @Test
    void testSum1DArray_forMaxValues() {
        int[] input = new int[]{1_000_000};
        int[] expected = new int[]{1_000_000};
        assertArrayEquals(expected, s.runningSum(input));
    }

    @Test
    void testSum1DArray_stressTest() {
        Random random = new Random(41); // fixed seed for reproducibility
        for (int n = 1; n < 1000; n++) {
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = random.nextInt(2_000_001) - 1_000_000;
            }
            int[] expected = groundTruthSum1DArray(input);
            int[] actual = s.runningSum(input);
            assertArrayEquals(expected, actual);
        }
    }

    private int[] groundTruthSum1DArray(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}