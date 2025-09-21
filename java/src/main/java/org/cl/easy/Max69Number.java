package org.cl.easy;

import java.util.ArrayList;

public class Max69Number {

    // ---------------------- SOLUTION 1 - pretty kak tbh -----------------------------//
    public int maximum69Number_solution1(int num) {

        int digit;
        ArrayList<Integer> digitList = new ArrayList<>();

        while (num != 0) {
            digit = num % 10;
            digitList.addFirst(digit);
            num = num / 10;
        }

        int indexToChange = digitList.indexOf(6);
        if (indexToChange != -1) {
            digitList.set(indexToChange, 9);
        }

        int maxNumber = 0;
        int multiplier = 1;
        for (int i = digitList.size() - 1; i >= 0; i--) {
            maxNumber += digitList.get(i) * multiplier;
            multiplier *= 10;
        }
        return maxNumber;
    }
    // Time Complexity = O(n^2) - Quadratic, due to .indexOf() and for loop
    // Space Complexity = O(n) - we created an ArrayList to handle digit manipulation

    // ---------------------- SOLUTION 2 - think primitive types -----------------------------//
    // TODO: Find a more optimised and less brute forced approach
}
