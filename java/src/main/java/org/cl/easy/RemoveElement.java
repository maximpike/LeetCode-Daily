package org.cl.easy;

import static java.util.Arrays.sort;

public class RemoveElement {

    // ---------------------- SOLUTION 1 - Bubble sort -----------------------------//
    public int removeElement_solution1(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            } else {
                nums[i] = '_';
            }
        }

        // Sort lowest to highest - Bubble sort
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {  // i cuts redundant comparisons (already pushed to end).
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return k;
    }
    // Time Complexity = O(n*n) = O(n^2) - Quadratic time
    // Space Complexity = O(1) - No new array created

    // ---------------------- SOLUTION 2 - Built-in Arrays.sort() -----------------------------//
    public int removeElement_solution2(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            } else {
                nums[i] = '_';
            }
        }
        sort(nums); // used built in method to sort nums array ascending order (improves TC - dual-pivot Quicksort).
        return k;
    }
    // Time Complexity = O(n + nlogn) = O(nlogn) - Quadratic time
    // Space Complexity = O(1) - No new array created

    // ---------------------- SOLUTION 3 - Selection sort -----------------------------//
    public int removeElement_solution3(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            } else {
                nums[i] = '_';
            }
        }

        // Sort lowest to highest - Selection sort
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return k;
    }
    // Time Complexity = O(n^2) - Quadratic time
    // Space Complexity = O(1) - No new array created

    // ---------------------- SOLUTION 4 - Best solution -----------------------------//
    public int removeElement_solution4(int[] nums, int val) {
        int k = 0;
        int modifiedArrayLength = nums.length;
        for (int i = 0; i < modifiedArrayLength; ) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[modifiedArrayLength - 1];
                nums[modifiedArrayLength - 1] = temp;
                modifiedArrayLength--;
            } else {
                i++;
                k++;
            }
        }
        return k;
    }
    // Time Complexity = O(n) - linear time
    // Space Complexity = O(1) - No new array created
}
