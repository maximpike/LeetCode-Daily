package org.cl.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDifference {

    // ---------------------- SOLUTION 1 -----------------------------//
    public char findTheDifference_solution1(String s, String t) {

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
        return (Character) set.toArray()[0]; // Casts Object → Character, then auto-unboxed to char for return
    }
    // Time Complexity: O(s+t) = O(n)
    // Space Complexity: O(n+1) = O(n)

    // ---------------------- SOLUTION 2 - Optimised -----------------------------//
    public char findTheDifference_solution2(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.keySet().iterator().next();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(t) - t number of unique characters in String t

    // ---------------------- SOLUTION 3 - Ascii values -----------------------------//
}
