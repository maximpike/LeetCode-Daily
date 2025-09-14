package org.cl.easy;

public class SmallestEvenMultiple {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int smallestEvenMultiple_solution1(int n) {
        if (n % 2 == 0) { // therefore an even value
            return n;
        } else {
            return n * 2;
        }
    }
    // Time Complexity = O(1)
    // Space Complexity = O(1)

    // ---------------------- SOLUTION 2 - Ternary operator-----------------------------//
    public int smallestEvenMultiple_solution2(int n) {
        return n%2 == 0 ? n : n*2;
    }
    // Time Complexity = O(1)
    // Space Complexity = O(1)
}
