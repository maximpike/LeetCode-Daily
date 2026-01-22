package org.cl.easy;

public class BinarySearch {

    // ---------------------- SOLUTION 1 - Iterative ----------------------------- //
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (target == nums[m]) {
                return m;
            }

            if (target <= nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    // ---------------------- SOLUTION 2 - Recursive  -----------------------------//

}
