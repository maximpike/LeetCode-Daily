package org.cl.easy;

public class ValidPerfectSquare {

    // ---------------------- SOLUTION 1 - BS Iterative ----------------------------- //
    public boolean isPerfectSquare_solution1(int num) {

        if (num < 2 ) {
            return true;
        }

        int l = 2;
        int r = num;

        while (l <= r) {
            int m = l + (r - l) / 2;
            long square = (long) m * m; // Ensures no integer overflow

            if (num == square) {
                return true;
            } else if (square > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
    // Time complexity = O(log n)
    // Space complexity = O(1)

    // ---------------------- SOLUTION 2 - Overflow safe ----------------------------- //
    public boolean isPerfectSquare_solution2(int num) {
        if (num == 1) {
            return true;
        }

        int l = 2;
        int r = num;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m == num / m && num % m == 0) {
                return true;
            } else if (m > num / m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
    // Time complexity = O(log n)
    // Space complexity = O(1)
}
