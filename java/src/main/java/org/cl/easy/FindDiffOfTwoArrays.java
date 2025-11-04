package org.cl.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDiffOfTwoArrays {

    // ---------------------- SOLUTION 1 -----------------------------//
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> nums1Set = new HashSet<>();
        for (int num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> nums2Set = new HashSet<>();
        for (int num : nums2) {
            if (!nums1Set.contains(num)) {
                nums2Set.add(num);
            }
        }

        for (int num : nums2) {
            nums1Set.remove(num);
        }

        result.add(new ArrayList<>(nums1Set));
        result.add(new ArrayList<>(nums2Set));
        return result;
    }
    // Time complexity: O(n+m)
    // Space complexity: O(n+m)

    // ---------------------- SOLUTION 2 - Better Time & Space? -----------------------------//
}
