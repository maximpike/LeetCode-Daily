package org.cl.easy;

public class PalindromeNumber {

    // ---------------------- SOLUTION 1 -----------------------------//
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int l = 0;
        int r = number.length() - 1;

        while (l < r) {
            if (number.charAt(l) == number.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    // ---------------------- SOLUTION 2 - No String.valueOf conversion  -----------------------------//
}
