package org.cl.easy;


import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    // ---------------------- SOLUTION 1 - HashMap -----------------------------//
    public int missingNumber_solution1(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
    // Time Complexity = 0(n+1) = O(n)
    // Space Complexity = O(n)

    // ---------------------- SOLUTION 2 -----------------------------//
    // Time Complexity = 0(n)
    // Space Complexity = O(1)
}
