package org.cl.easy;


public class ValueVariableAfterOperations {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int finalValueAfterOperations_solution1(String[] operations) {

        int x = 0;
        for (String operation : operations) {
            if (operation.contains("+")) { x++; }
            if (operation.contains("-")) { x--; }
        }
        return x;
        // Time Complexity = O(n)
        // Space Complexity = O(1)
    }

    // ---------------------- SOLUTION 2 -----------------------------//
    public int finalValueAfterOperations_solution2(String[] operations) {

        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {x++;}
            if (operations[i].charAt(1) == '-') {x--;}
        }
        return x;
        // Time Complexity = O(n)
        // Space Complexity = O(1)
    }

    // TODO: create third solution using streams if possible
    // ---------------------- SOLUTION 3 -----------------------------//

}
