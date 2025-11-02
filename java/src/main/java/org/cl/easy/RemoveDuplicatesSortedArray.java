package org.cl.easy;

public class RemoveDuplicatesSortedArray {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[l] != nums[r]) {
                l++;
                nums[l] = nums[r];
            }
        }
        return l + 1;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Brute force-----------------------------//
}
