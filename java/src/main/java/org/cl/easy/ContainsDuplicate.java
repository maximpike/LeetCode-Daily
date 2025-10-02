package org.cl.easy;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    // ---------------------- SOLUTION 1 -----------------------------//
    public boolean containsDuplicate_solution1(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) >= 1) {
                return true;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return false;
    }
    // Time complexity: O(n)
    // Space complexity: O(n)

    // ---------------------- SOLUTION 1 - Use HashSet -----------------------------//
    public boolean containsDuplicate_solution2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    // Time Complexity = O(n)
    // Space Complexity = O(n)
}
