package org.cl.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntExistsWithNegative {

    // ---------------------- SOLUTION 1 - Two Pointers -----------------------------//
    public int findMaxK_solution1(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums); // defines time complexity for solution

        while (nums[l] < 0 && l < r) {
            if (Math.abs(nums[l]) == nums[r]) {
                return nums[r];
            } else if (Math.abs(nums[l]) < nums[r]) {
                r--;
            } else {
                l++;
            }
        }
        return -1;
    }
    // Time complexity: O(nlogn)
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Hashmap -----------------------------//
    public int findMaxK_solution2(int[] nums) {
        Set<Integer> seenInteger = new HashSet<>();
        int result = -1;

        for (int num : nums) {
            seenInteger.add(num);
            int k = num * -1; // Inverse sign of value
            if (seenInteger.contains(k)) {
                result = Math.max(Math.abs(num), result);
            }
        }
        return result;
    }
    // Time complexity: O(n)
    // Space complexity: O(n)
}
