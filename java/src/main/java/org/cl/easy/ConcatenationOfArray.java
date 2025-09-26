package org.cl.easy;

public class ConcatenationOfArray {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int[] getConcatenation_solution1(int[] nums) {

        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
    // Time Complexity = O(2n) ~ = O(n) - Each iteration does 2 assignments in constant time (total operations = 2n).
    // Space Complexity = O(2n) ~ = O(n) - we are doubling the size of new output array (n & i are equal to O(1))

    // ---------------------- SOLUTION 2 -----------------------------//
    public int[] getConcatenation_solution2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
    // Time Complexity = O(2n) - System.arraycopy copies n elements in one call.
    //                 = O(n)    We call it twice, so it copies 2n elements total.
    // Space Complexity = O(2n) ~ O(n) - NEW ARRAY therefore requires O(n) extra space
}
