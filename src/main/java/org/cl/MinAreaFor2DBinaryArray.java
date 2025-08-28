package org.cl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAreaFor2DBinaryArray {

    public int minimumArea(int[][] grid) {

        // Solution 1:
        int maxHeight = grid.length;
        int maxWidth = grid[0].length;
        // These are the max dim our grid can have
        System.out.println("Max Height: " + maxHeight + " Max Width: " + maxWidth);
        System.out.println("Max Area = " + maxHeight * maxWidth);

        int onesCounter = 0; // Var to Sum the number of ones in the grid
        int onesRowsCounter = 0; // Var to Sum the rows that have ones, can't use same logic to sum cols that have ones
        int minRowOneValue = 0;
        int maxRowOneValue = 0;
        int rowsWithOnesDiff;
        int minHeight;

        // To find cols that have ones we need to use Array and write ones values in col index
        int [] tempArray = new int[maxWidth];

        for (int i = 0; i < maxHeight; i++) {
//            System.out.println("Array for row [" + i + "] = " + Arrays.toString(grid[i]));
            int tempRowCounter = 0;
            for (int j = 0; j < maxWidth; j++) {
//                System.out.println("Index value at: " + i + j + " = " + grid[i][j]);
                if (grid[i][j] == 1) {
                    onesCounter++;
                    tempRowCounter++;
                    tempArray[j] = 1;

                }
            }

            // I've found out how to agg rows need to work out how to agg cols with respect to index placing
            if (tempRowCounter > 0) {
                if (onesRowsCounter > 0) {
                    maxRowOneValue = i;
                } else {
                    minRowOneValue = i;
                }
                onesRowsCounter++;
            }
//            System.out.println("tempArray = " + Arrays.toString(tempArray));
        }
        rowsWithOnesDiff = maxRowOneValue - minRowOneValue;
        System.out.println("Rows with ones diff: " + rowsWithOnesDiff);

        int start = 0;
        int end = tempArray.length - 1;
        int zeroCounter = 0;
        int nonZeroCounter = 0;
        List<Integer> trimListArray = new ArrayList<>(Arrays.stream(tempArray).boxed().toList());
        System.out.println("trimListArray: " + trimListArray);

        while (start <= end) {
            System.out.println("Start Array[" + start + "] = " + tempArray[start]);
            if (tempArray[start] == 0) {
                zeroCounter++;
                if (trimListArray.size() < start) {
                    trimListArray.remove(end-start);
                } else {
                    trimListArray.remove(start);
                }
                System.out.println("Array value at start: " + start + " removed");
            } else {
                nonZeroCounter++;
                break;
            }
            start++;
        }

        while (end >= start) {
            System.out.println("End Array[" + end + "] = " + tempArray[end]);
            if (tempArray[end] == 0) {
                zeroCounter++;
                if (trimListArray.size() > end) {
                    trimListArray.remove(end);
                } else {
                    trimListArray.remove(end-start);
                }
            } else {
                nonZeroCounter++;
                break;
            }
            end--;
        }

        System.out.println("non zero counter = " + nonZeroCounter);
        System.out.println("zero counter = " + zeroCounter);
        System.out.println("trim list = " + trimListArray);

        int[] resultArray = trimListArray.stream().mapToInt(Integer::intValue).toArray();

        if (onesRowsCounter <= rowsWithOnesDiff) {
            minHeight = rowsWithOnesDiff+1;
        } else {
            minHeight = onesRowsCounter;
        }
        int minWidth = resultArray.length;

        System.out.println("New Min grid dimensions are h x w = " + minHeight + " x " + minWidth);
        System.out.println("Max Area = " + minHeight * minWidth);
        if (onesCounter <= 0) {
            System.out.println("Special case of Zeros Matrix, area = " + 1 + "\n");
            return 1;
        }
        System.out.println("For grid: " + Arrays.deepToString(grid) + " number of ones = " + onesCounter + "\n");

        return minHeight * minWidth;
    }
}
