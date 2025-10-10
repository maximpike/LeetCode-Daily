package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAveSubArrayITest {

    @Test
    void findMaxAverage_example1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        MaxAveSubArrayI maxAveSubarrayI = new MaxAveSubArrayI();
        assertEquals(12.75000, maxAveSubarrayI.findMaxAverage_solution1(nums, 4), 1e-5);
        assertEquals(12.75000, maxAveSubarrayI.findMaxAverage_solution2(nums, 4), 1e-5);
    }

    @Test
    void findMaxAverage_example2() {
        int[] nums = {5};
        MaxAveSubArrayI maxAveSubarrayI = new MaxAveSubArrayI();
        assertEquals(5.00000, maxAveSubarrayI.findMaxAverage_solution1(nums, 1), 1e-5);
        assertEquals(5.00000, maxAveSubarrayI.findMaxAverage_solution2(nums, 1), 1e-5);
    }

    @Test
    void findMaxAverage_example3() {
        int[] nums = {0,1,1,3,3};
        MaxAveSubArrayI maxAveSubarrayI = new MaxAveSubArrayI();
        assertEquals(2.00000, maxAveSubarrayI.findMaxAverage_solution1(nums, 4), 1e-5);
        assertEquals(2.00000, maxAveSubarrayI.findMaxAverage_solution2(nums, 4), 1e-5);
    }

    @Test
    void findMaxAverage_example4() {
        int[] nums = {0,4,0,3,2};
        MaxAveSubArrayI maxAveSubarrayI = new MaxAveSubArrayI();
        assertEquals(4.00000, maxAveSubarrayI.findMaxAverage_solution1(nums, 1), 1e-5);
        assertEquals(4.00000, maxAveSubarrayI.findMaxAverage_solution2(nums, 1), 1e-5);
    }

    @Test
    void findMaxAverage_example5() {
        int[] nums = {4,2,1,3,3};
        MaxAveSubArrayI maxAveSubarrayI = new MaxAveSubArrayI();
        assertEquals(3.00000, maxAveSubarrayI.findMaxAverage_solution1(nums, 2), 1e-5);
        assertEquals(3.00000, maxAveSubarrayI.findMaxAverage_solution2(nums, 2), 1e-5);
    }
}