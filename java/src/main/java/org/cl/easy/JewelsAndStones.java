package org.cl.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int numberJewelsInStones(String jewels, String stones) {
        int totalJewels = 0;
        Set<Character> jewelsSet = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }

        for (int j = 0; j < stones.length(); j++) {
            if (jewelsSet.contains(stones.charAt(j))) {
                totalJewels++;
            }
        }
        return totalJewels;
    }
    // Time complexity: O(n+m)
    // Space complexity: O(n) - size based on number elements in jewels
}
