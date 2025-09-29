package org.cl.easy;

import java.util.HashMap;

public class ValidAnagram {

    // ---------------------- SOLUTION 1 -----------------------------//
    public boolean isAnagram(String s, String t) {

        if (s.replaceAll("\\s+", "").length() != t.replaceAll("\\s+", "").length()) {
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
}
