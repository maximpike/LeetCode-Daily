package org.cl.medium;

import java.util.*;

public class GroupAnagrams {

    // ---------------------- SOLUTION 1 -----------------------------//
    public List<List<String>> groupAnagrams_solution1(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); // TC: O(klogk) -> dominant operation
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
    // TODO: Go through time and space complexity
    // Time Complexity: O(n*klogk) - n = number of strings in the input array
    //                               k = max length of a string
    // Space Complexity: O(n*k) - Stores up to n strings across all lists O(n*k) for the strings
    //                          - Keys are sorted strings, also up to n keys of length k

    // ---------------------- SOLUTION 2 - optimised -----------------------------//
    public List<List<String>> groupAnagrams_solution2(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    // Time Complexity: O(n*klogk)
    // Space Complexity: O(n*k)

    // Extra helper method
    private boolean isAnagram(String s1, String s2) {

        char[] charsMap1 = s1.toCharArray();
        char[] charsMap2 = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : charsMap1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : charsMap2) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}
