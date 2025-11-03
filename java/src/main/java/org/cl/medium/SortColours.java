package org.cl.medium;

import java.util.Arrays;

public class SortColours {

    // ---------------------- SOLUTION 1 -----------------------------//
    public void sortColors_solution1(int[] nums) {
        int i = 0;
        int l = 0; // tracking zeros
        int r = nums.length - 1; // tracking two's

        while (i <= r) {
            if (i == l && nums[i] == 0) {
                l++;
                i++;
            } else if (nums[i] == 0) {
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;
                l++;
            } else if (nums[i] == 2) {
                int temp = nums[r];
                nums[r] = nums[i];
                nums[i] = temp;
                r--;
            } else {
                i++;
            }
        }
    }
    // Time complexity: O(n) - number operations
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Sol 1 Optimised -----------------------------//
    public void sortColors_solution2(int[] nums) {
        int i = 0; // search
        int l = 0; // tracking zeros
        int r = nums.length - 1; // tracking two's

        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                i++;
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
            } else {
                i++;
            }
        }
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

    private void swap(int[] nums, int searchIndex, int trackIndex) {
        int temp = nums[trackIndex];
        nums[trackIndex] = nums[searchIndex];
        nums[searchIndex] = temp;
    }

    // ---------------------- SOLUTION 3 - Brute force -----------------------------//
    public void sortColors_solution3(int[] nums) {
        int[] sortedArray = new int[nums.length];
        Arrays.fill(sortedArray, 1);

        int l = 0;
        int r = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sortedArray[l] = nums[i];
                l++;
            } else if (nums[i] == 2) {
                sortedArray[r] = nums[i];
                r--;
            }
        }
        System.arraycopy(sortedArray, 0, nums, 0, nums.length);
    }
    // Time complexity: O(n)
    // Space complexity: O(n)
}
