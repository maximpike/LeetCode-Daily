package org.cl.medium;

public class ContainerWithMostWater {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int maxArea_solution1(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            int containerLimit = Math.min(height[l], height[r]);
            int containerWater = (r - l) * (containerLimit);
            maxWater = Math.max(maxWater, containerWater);
            if (height[l] < height[r]) {
                l++;
            } else if (height[l] > height[r]) {
                r--;
            } else {
                l++;
                r--;
            }
        }
        return maxWater;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Brute Force -----------------------------//
    public int maxArea_solution2(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int width = j-i;
                maxArea = Math.max(maxArea, width*minHeight);
            }
        }
        return maxArea;
    }
    // Time complexity: O(n^2)
    // Space complexity: O(1)

    // --------------------- SOLUTION 3 - Clean syntax version ----------------------------//
    public int maxArea_solution3(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int width = r - l;
            maxWater = Math.max(maxWater, width * minHeight);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)
}
