package org.cl.easy;

public class DIStringMatch {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length() + 1];
        int min = 0;
        int max = s.length();

        for (int i = 0; i < perm.length - 1; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = min;
                min++;
            } else if (s.charAt(i) == 'D') {
                perm[i] = max;
                max--;
            }
        }
        perm[perm.length - 1] = min;
        return perm;
    }
    // Time complexity: O(n) - operations on perm elements
    // Space complexity: O(n) - no. elements in perm
}
