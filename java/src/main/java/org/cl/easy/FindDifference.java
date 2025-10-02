package org.cl.easy;

import java.util.HashMap;
import java.util.Set;

public class FindDifference {

    // ---------------------- SOLUTION 1 -----------------------------//
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            map.put(tChar, map.getOrDefault(tChar, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            map.put(sChar, map.get(sChar) - 1);
            if (map.get(sChar) == 0) {
                map.remove(sChar);
            }
        }

        Set<Character> set = map.keySet();
        return set.iterator().next();
    }
    // Time Complexity: O(s+t) = O(n)
    // Space Complexity: O(n+1) = O(n)

    // ---------------------- SOLUTION 2 - Ascii values -----------------------------//
}
