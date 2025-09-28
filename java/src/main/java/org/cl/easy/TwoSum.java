package org.cl.easy;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int[] twoSum_solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    // Time complexity: O(n^2)
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Use Hash table or Hash map -----------------------------//
    public int[] twoSum_solution2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            // x = target - cur
            if (map.containsKey(target-cur)) {
                return new int[] {map.get(target-cur), i};
            }
            map.put(cur, i);
        }
        return null;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
}
