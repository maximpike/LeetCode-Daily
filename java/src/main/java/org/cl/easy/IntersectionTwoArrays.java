package org.cl.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {

    // ---------------------- SOLUTION 1 - HashMap/HashSet -----------------------------//
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> result = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    // Time complexity: O(n+m+k) = O(n+m) - k: size of intersection
    // Space complexity: O(n+m) = O(n+m)

    // ---------------------- SOLUTION 2 - Pointers -----------------------------//
}
