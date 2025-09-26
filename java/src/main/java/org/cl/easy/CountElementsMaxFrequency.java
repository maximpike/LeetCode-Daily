package org.cl.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountElementsMaxFrequency {

    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int totalfrequency = 0;

        for (int num : nums) {
            int currentCount = numsMap.getOrDefault(num, 0);
            numsMap.put(num, currentCount + 1);
        }

        int maxValue = Collections.max(numsMap.values());
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                totalfrequency += entry.getValue();
            }
        }
        return totalfrequency;
    }
    // Time Complexity = O(n + k + k) = O(n)
    // Space Complexity = O(k)
}
