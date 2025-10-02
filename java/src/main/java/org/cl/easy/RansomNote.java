package org.cl.easy;

import java.util.HashMap;

public class RansomNote {

    // ---------------------- SOLUTION 1  -----------------------------//
    public boolean canConstruct_solution1(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char magChar = magazine.charAt(i);
            map.put(magChar, map.getOrDefault(magChar, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteChar = ransomNote.charAt(i);
            if (!map.containsKey(ransomNoteChar) || map.get(ransomNoteChar) <= 0) {
                return false;
            } else {
                map.put(ransomNoteChar, map.get(ransomNoteChar) - 1);
            }
        }
        return true;
    }
    // Time Complexity: O(m+r) = O(n)
    // Space Complexity: O(n)

    // ---------------------- SOLUTION 2 - verify solution -----------------------------//
    public boolean canConstruct_solution2(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {

            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);
            if (matchingIndex == -1) {
                return false;
            }
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
        return true;
    }
    // Time complexity = O(n x m)
    // Space complexity = O(m)
}
