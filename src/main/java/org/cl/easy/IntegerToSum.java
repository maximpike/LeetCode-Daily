package org.cl.easy;

import java.util.Arrays;

public class IntegerToSum {

    public int[] getNoZeroIntegers(int n) {

        // ---------------------- SOLUTION 1 -----------------------------//
//        int a;
//        int b;
//        int[] answerArray = new int[2]; // we know the size of the output array
//
//        for (int i = 1; i <= n/2; i++) {
//            a = i;
//            b = n - i;
//            String aString = Integer.toString(a);
//            String bString = Integer.toString(b);
//            if(a%10 !=0 && b%10 != 0 && !aString.contains("0") && !bString.contains("0")) {
//                answerArray = new int[]{a, b};
//                System.out.println(Arrays.toString(answerArray));
//                return answerArray;
//            } else{
//                System.out.println("a or b INVALID (a=" + a + ") & (b=" + b + ")");
//            }
//        }
//        return answerArray;
//    }
//    // Time Complexity = ?
//    // Space Complexity = ?

        // ---------------------- SOLUTION 2 - Optimised -----------------------------//
//        int a;
//        int b;
//        int[] answerArray = new int[2]; // Can we declare a new instance of array in return rather
//        for (int i = 1; i <= n / 2; i++) {
//            a = i;
//            b = n - i;
//            String aString = Integer.toString(a);
//            String bString = Integer.toString(b);
//            if (!aString.contains("0") && !bString.contains("0")) {
//                answerArray = new int[]{a, b};
//                System.out.println(Arrays.toString(answerArray));
//                return answerArray;
//            } else {
//                System.out.println("a or b INVALID (a=" + a + ") & (b=" + b + ")");
//            }
//        }
//        return answerArray;
//    }

        // ---------------------- SOLUTION 3 -  -----------------------------//
        for (int A = 1; A < n; ++A) {
            int B = n - A;
            if (!String.valueOf(A).contains("0") && !String.valueOf(B).contains("0")) {
                return new int[]{A, B};
            }
        }
        return new int[0];
    }

    // ---------------------- SOLUTION 4 - Digit Manipulation -----------------------------//


}
