package org.cl.medium;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringWithoutRepeatingCharacters {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> indexSeen = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);

            if (indexSeen.containsKey(currentChar)) {
                l = Math.max(l, indexSeen.get(currentChar) + 1);
            }
            indexSeen.put(currentChar, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    // Time complexity: O(n)
    // Space complexity: O(k) -> worst case O(n)

    // ---------------------- SOLUTION 2 - Brute Force -----------------------------//
}
