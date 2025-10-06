package org.cl.easy;

public class ValidPalindrome {

    // ---------------------- SOLUTION 1  -----------------------------//
    public boolean isPalindrome_solution1(String s) {

        char[] c = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();

        int l = 0;
        int r = c.length - 1;

        while (l <= r) {
            if (c[l] != c[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    // Time Complexity: O(c) = O(n)
    // Space Complexity: O(c) = O(n)

    // ---------------- SOLUTION 2 - small syntax improvement  -----------------------//
    public boolean isPalindrome_solution2(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
