package org.cl.easy;

public class PowerOfFour {

    // Easy
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        } else {
            return ((n & 0x55555555) != 0) && ((n & (n-1)) == 0);
        }
        // Time Complexity: O(1)
        // Space Complexity O(0)
    }
}
