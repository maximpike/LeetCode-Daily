package org.cl.medium;

import java.util.Stack;

public class CountSubMatricesWithAllOnes {

    public int numSubmat(int[][] mat) {

//        int m = mat.length;     // no. rows
//        int n = mat[0].length;  // no. cols
//        System.out.println("No. Rows = " + m + "\nNo. Columns = " + n + "\n");
//        int total = 0;
//
//        // heights array (same length as number of columns)
//        int[] heights = new int[n];
//
//        for (int i = 0; i < m; i++) {
//            System.out.println("Row matrix : " + Arrays.toString(mat[i]));
//
//            for (int j = 0; j < n; j++) {
//                System.out.println("m x n: " + i + "x" + j + " -> value at index: " + mat[i][j]);
//                if (mat[i][j] == 1) {
//                    heights[j] += 1;
//                } else {
//                    heights[j] = 0;
//                }
//                System.out.println("height Value : " + heights[j]);
//            }
//            System.out.println("height : " + Arrays.toString(heights) + "\n");
//
//            for (int start = 0; start < n; start++) {
//                int minHeight = Integer.MAX_VALUE; // Bug fix ensures no value is greater than height value
//                for (int row = start; row < n; row++) {
//                    minHeight = Math.min(minHeight, heights[row]);
//                    System.out.println("For row " + row + " -> minHeight : " + minHeight);
//                    total += minHeight;
//                    System.out.println("total: " + total);
//                }
//            }
//        }
//        System.out.println("");


//        //Solution 2: Not Working
//        int m = mat.length;
//        int n = mat[0].length;
//        int total = 0;
//        int[] heights = new int[n]; // define heights here
//
//        for (int i = 0; i < m; i++) {
//            // update heights for this row
//            for (int j = 0; j < n; j++) {
//                if (mat[i][j] == 1) {
//                    heights[j] += 1;
//                } else {
//                    heights[j] = 0;
//                }
//            }
//
//            // now apply the sort-row-heights method
//            int[] sortedHeights = heights.clone();
//            Arrays.sort(sortedHeights);  // ascending sort by default
//            for (int j = n - 1; j >= 0; j--) {
//                int h = sortedHeights[j];
//                total += h * (n - j);   // contribution of column j
//            }
//        }
//
//        return total;
//    }

        int m = mat.length;
        int n = mat[0].length;
        int total = 0;
        int[] heights = new int[n];

        for (int i = 0; i < m; i++) {
            // update heights
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            // monotonic stack for counting rectangles in this row
            Stack<Integer> stack = new Stack<>();
            int[] dp = new int[n]; // dp[j] = number of submatrices ending at column j
            for (int j = 0; j < n; j++) {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    int prev = stack.peek();
                    dp[j] = dp[prev] + heights[j] * (j - prev);
                } else {
                    dp[j] = heights[j] * (j + 1);
                }
                stack.push(j);
                total += dp[j];
            }
        }
        return total;
    }
}
