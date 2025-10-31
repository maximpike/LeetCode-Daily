package org.cl.easy;

public class SquaresSortedArray {

    // ------------------ SOLUTION 1 - conceptual termination -------------------------//
    public int[] sortedSquares_solution1(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int p = nums.length - 1;
        int[] result = new int[nums.length];

        while (l <= r) {
            int leftSq = nums[l] * nums[l];
            int rightSq = nums[r] * nums[r];
            if (leftSq < rightSq) {
                result[p] = rightSq;
                r--;
            } else {
                result[p] = leftSq;
                l++;
            }
            p--;
        }
        return result;
    }

    // ------------------ SOLUTION 2 - mechanical termination -------------------------//
    public int[] sortedSquares_solution2(int[] nums) {
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int p = result.length - 1;

        while (p >= 0) {
            int lSquared = nums[l] * nums[l];
            int rSquared = nums[r] * nums[r];

            if (lSquared < rSquared) {
                result[p] = rSquared;
                r--;
            } else {
                result[p] = lSquared;
                l++;
            }
            p--;
        }
        return result;
    }
}
