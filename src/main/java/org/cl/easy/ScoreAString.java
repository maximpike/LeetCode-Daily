package org.cl.easy;

import java.nio.charset.StandardCharsets;

public class ScoreAString {

    // ---------------------- SOLUTION 1 - Casting -----------------------------//
    public int scoreOfString_solution1(String s) {

        int sum = 0;
        char[] chars = s.toLowerCase().toCharArray();
        char previousChar = chars[0];
        // Slight optimisation as we start at index [1] as index [0] initialised to previous value
        for (int i = 1; i < chars.length; ++i) {
            sum += Math.abs((int) previousChar - (int) chars[i]);
            previousChar = chars[i];
        }
        return sum;
    }
    // Time Complexity = 0(n) Therefore linear time
    // Space Complexity = 0(1) - only used a single additional variable (Aux Space)

    // ---------------------- SOLUTION 2 - index -----------------------------//
    public int scoreOfString_solution2(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
    // Time Complexity = 0(n)
    // Space Complexity = 0(1)

    // ---------------------- SOLUTION 2 - Bytes -----------------------------//
    public int scoreOfString_solution3(String s) {
        int score = 0;
        byte[] b = s.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(b[i] - b[i+1]);
        }
        return score;
    }
    // Time Complexity = 0(n)
    // Space Complexity = 0(1)
}
