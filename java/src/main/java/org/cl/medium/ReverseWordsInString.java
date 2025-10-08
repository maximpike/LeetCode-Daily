package org.cl.medium;

public class ReverseWordsInString {

    // -------------------- SOLUTION 1 - dont use StingBuilder  ---------------------------//
    public String reverseWords_solution1(String s) {

        String[] words = s.trim().split("\\s+");
        int l = 0;
        int r = words.length - 1;

        while (l < r) {
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        return String.join(" ", words);
    }
    // Time Complexity: O(3n) = O(n)
    // Space Complexity: O(2n) = O(n) [Aux space: O(n)]

    // -------------------- SOLUTION 2 - O(1) space ---------------------------//
    public String reverseWords_solution2(String s) {
        return null;
    }

    // -------------- SOLUTION 3 - Built in functions ---------------------//
    public String reverseWords_solution3(String s) {

        String[] words = s.trim().split("\\s+"); // Split optimization - \\s+ automatically ignores multiple spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString(); // O(n)
    }
    // Time Complexity: O(3n) = O(n)
    // Space Complexity: O(3n) = O(n) [Aux space: O(2n) = O(n)]
}
