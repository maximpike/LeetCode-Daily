package org.cl.easy;

public class MaxAveSubArrayI {

    // ---------------------- SOLUTION 1 -----------------------------//
    public double findMaxAverage_solution1(int[] nums, int k) {

        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxSum = windowSum;

        for (int r = k ; r < nums.length; r++) {
            windowSum += nums[r] - nums[r-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum/k;
    }

    // ---------------------- SOLUTION 2 - Possible Integer overflow -----------------------------//
    public double findMaxAverage_solution2(int[] nums, int k) {

        int windowValue = 0;

        for (int i = 0; i < k; i++) { // initial window value
            windowValue += nums[i];
        }
        int maxWindowValue = windowValue;

        for (int r = k ; r < nums.length; r++) {
            windowValue = windowValue - nums[r-k] + nums[r];
            maxWindowValue = Math.max(windowValue, maxWindowValue);
        }
        return (double) maxWindowValue /k;
    }
}
