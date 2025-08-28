package org.cl;

import java.util.Arrays;

public class MyProblemSubMatricesWithAllOnes {

    public int numSubmat(int[] mat) {

        System.out.println("\nInitial Array: " + Arrays.toString(mat));
//        int rectangleCounter = 0;
//        int previousMatrixValue = 2; // can't initialise to zero as we are dealing with binary values
//        boolean previousValueMatch = false;
//        for (int i = 0; i<mat.length; i++) {
//            System.out.println("Col " + i + " has matrix value: " + mat[i]);
//            if (mat[i] == 1) {
//                rectangleCounter++;
//            }
//
//            if (previousMatrixValue == mat[i] && mat[i] != 0) {
//                System.out.println("Previous Value: " + previousMatrixValue + " Equals mat[i]: " + mat[i]);
//                rectangleCounter++;
//                if (previousValueMatch) {
//                    rectangleCounter++;
//                }
//                previousValueMatch = true;
//            }
//            previousMatrixValue = mat[i];
//        }
        int total = 0;
        int run = 0; // Each iteration through elements of matrix, i.e 1; 1,2; 1;2;3 etc
        for (int bit : mat) {
            if (bit == 1) {
                run++;
                total += run;
            } else {
                run = 0;
            }
        }

        System.out.println("Sub-matices with all ones: " + total);
        return total;
    }
}
