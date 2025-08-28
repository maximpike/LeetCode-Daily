package org.cl.easy;

public class MaxAreaOfLongestDiagonal {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        // ---------------------- SOLUTION 1 -----------------------------//
        int l = 0;
        int w = 0;
        int rectangleArea;
        int maxRectangleArea = 0;
        int diagLength;
        int maxDiagonalLength = 0;

        for (int i = 0; i < dimensions.length; i++) {
            for (int j = 0; j < dimensions[0].length; j++) { // Inner loop always only runs 2 times [0] & [1]
                l = dimensions[i][0];
                w = dimensions[i][1];
            }
            diagLength = (l * l) + (w * w);
            rectangleArea = l * w;
            if (diagLength > maxDiagonalLength) {
                // If we compute a diagonal length greater than the maxDiagonalLength then we can assume the l & w
                // for this rectangle will give us the maxRectangleArea
                maxRectangleArea = rectangleArea;
                // Need to update maxDiagonalLength to new max Value
                maxDiagonalLength = diagLength;
            } else if (diagLength == maxDiagonalLength) {
                maxRectangleArea = Math.max(rectangleArea, maxRectangleArea);
            }
        }
        return maxRectangleArea;
    }
        // Time Complexity = 0(nm) = O(n2) ~ O(n) - Therefore linear time
        // Space Complexity = 0(1) - Use a fixed number of variables.
        //                         - No additional arrays, lists, or recursive stack growth.
        //                         - The size of these variables does not depend on input size.

        // ---------------------- SOLUTION 2 - Optimised -----------------------------//
//        int maxArea = 0;
//        int maxDiagLength = 0;
//
//        for (int[] dim : dimensions) {
//            int length = dim[0];
//            int width = dim[1];
//            int diagLength = length*length + width*width; // Compute Diagonal square for each rectangle
//            int area = length * width; // Compute Area for each rectangle
//
//            if (diagLength > maxDiagLength) { // If we find new Max diagonal length for rectangle -> Compute new maxArea
//                maxDiagLength = diagLength;
//                maxArea = length * width;
//            } else if (diagLength == maxDiagLength) { // If diag's are same compare areas and find max between area's
//                maxArea = Math.max(maxArea, area);
//            }
//        }
//        return maxArea;
//    }
//        // Time Complexity = 0(n) - asymptotic complexity
//        // Space Complexity = 0(1)
}
