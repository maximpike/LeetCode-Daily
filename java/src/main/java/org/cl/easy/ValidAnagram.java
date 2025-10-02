package org.cl.easy;

import java.util.HashMap;

public class ValidAnagram {

    // ---------------------- SOLUTION 1 -----------------------------//
    public boolean isAnagram_solution1(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            int charCounter = 1;
            if (charMap.containsKey(c)) {
                charCounter = charMap.get(c);
                charCounter++;
            }
            charMap.put(c, charCounter);
        }

        for (int i = 0; i < t.length(); i++) {
            if (charMap.containsKey(t.charAt(i))) {
                charMap.put(t.charAt(i), charMap.get(t.charAt(i)) - 1);
                if (charMap.get(t.charAt(i)) == 0) {
                    charMap.remove(t.charAt(i));
                }
            }
        }
        return charMap.isEmpty();
    }
    // Time Complexity: O(s+t+O(1)) = O(s+t) = O(n) -> .chatAt() is O(1)
    // Space Complexity: O(s+t) = O(2n) = O(n) -> charArray + charMap and
    //                   - replaceAll: scans the string and builds a new one

    // ---------------------- SOLUTION 2 - optimised -----------------------------//
    public boolean isAnagram_solution2(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            map.put(tChar, map.getOrDefault(tChar, 0) - 1);
            if (map.get(tChar) == 0) {
                map.remove(tChar);
            }
        }
        return map.isEmpty();
    }
    // Time Complexity: O(n+n) = O(n)
    // Space Complexity: O(n)

    // ---------------------- SOLUTION 3 - Unicode characters -----------------------------//
}
