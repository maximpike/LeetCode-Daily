package org.cl.easy;

public class SearchInsertPosition {

    // ---------------------- SOLUTION 1 - Iterative ----------------------------- //
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int insertIndex = -1;

        while (l <= r) {
            int m = l + ((r - l) / 2);

            if (target <= nums[m]) {
                r = m - 1;
                insertIndex = m;
            } else {
                l = m + 1;
                insertIndex = m + 1;
            }
        }
        return insertIndex;
    }
    // Time complexity = O(log n)
    // Space complexity = O(1)
}
