package org.cl.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> fizzBuzzGenerator(int n) {

        // ---------------------- SOLUTION 1 -----------------------------//
        List<String> fizzBuzzResult = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResult.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzResult.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzResult.add("Buzz");
            } else {
                fizzBuzzResult.add(String.valueOf(i));
            }
        }
        return fizzBuzzResult;
    }
    // Time complexity: O(n) - linear complexity [loop 1-n] (runtime shortest - 1ms)
    // Space complexity: O(n) - ArrayList stores n strings. [Auxiliary space = O(1)]
    //                        - Each string is at most "FizzBuzz" (8 characters), so in Big-O terms,
    //                          the extra memory grows linearly with n.

        // ---------------------- SOLUTION 2 - String Concatenation -----------------------------//
//        List<String> fizzBuzzResult = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            String currentString = ""; // reset string for each index
//            if (i % 3 == 0) { currentString += "Fizz"; }
//            if (i % 5 == 0) { currentString += "Buzz";}
//            if (currentString.isEmpty()) { currentString += String.valueOf(i); }
//            fizzBuzzResult.add(currentString);
//        }
//        return fizzBuzzResult;
//        // Time complexity: O(n) (runtime slightly shorter - 3ms)
//        // Space complexity: O(1) - If we ignore the output array then O(1) and therefore Auxiliary space

    // ---------------------- SOLUTION 3 - Using Streams -----------------------------//
//    return IntStream.rangeClosed(1, n)
//            .mapToObj(i -> (i % 3 == 0 ? "Fizz" : "") +
//                               (i % 5 == 0 ? "Buzz" : "") +
//                               (i %3 != 0 && i%5 != 0 ? i : "")).
//            collect(Collectors.toList());
//    }
//    // Time complexity: O(n) (runtime slightly longer - 4ms)
//    // Space complexity: O(n) [Auxiliary space = O(1)]
}
