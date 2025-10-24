package org.cl.easy;

public class MoveZeros {

    // ---------------------- SOLUTION 1  -----------------------------//
    public void moveZeroes_solution1(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    // ---------------------- SOLUTION 2  -----------------------------//
    public void moveZeroes_solution2(int[] nums) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
}
