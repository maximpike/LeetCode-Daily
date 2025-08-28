package org.cl.easy;

import java.util.Arrays;

public class Sum1DArray {

    public int[] runningSum(int[] nums) {

        // ---------------------- SOLUTION 1 -----------------------------//
//        int[] results = new int[nums.length];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            results[i] = sum;
//        }
//        return results;
//      // Time complexity = O(n)
//      // Space complexity = O(n) - Auxiliary Space O(1)

        // ---------------------- SOLUTION 2 -----------------------------//
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
      // time complexity = O(n)
      // Aux space complexity = O(1)
    }
}
