package org.cl.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfLongestDiagonalTest {

    // Removes duplication of boilerplate
    MaxAreaOfLongestDiagonal solver;

    @BeforeEach
    void setUp() {
        solver = new MaxAreaOfLongestDiagonal();
    }
    // Removes duplication of boilerplate

    @Test
    void testAreaOfMaxDiagonalFor1x2Array() {
        int[][] input = new int[][] {
                {1, 2}, // DL^2 = 2 & Area = 2
        };
        assertEquals(2, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor1x2Array_maxValues() {
        int[][] input = new int[][] {
                {100, 100}, // DL^2 = 20000 & Area = 10000
        };
        assertEquals(10000, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor1x2Array_minValues() {
        int[][] input = new int[][] {
                {1, 1}, // DL^2 = 1 & Area = 1
        };
        assertEquals(1, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor2x2Array() {
        int[][] input = new int[][] {
                {1, 2}, // DL^2 = 2 & Area = 2
                {3, 4}  // DL^2 = 25 & Area = 12 <****
        };
        assertEquals(12, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor2x2Array_row1LargestDiagonal() {
        int[][] input = new int[][] {
                {7, 22}, // DL^2 = 533 & Area = 154
                {6, 23}  // DL^2 = 565 & Area = 138 <****
        };
        assertEquals(138, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor2x2Array_row0LargestDiagonal() {
        int[][] input = new int[][] {
                {8, 6}, // DL^2 = 100 & Area = 48 <****
                {9, 3}  // DL^2 = 90  & Area = 27
        };
        assertEquals(48, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor2x2Array_equalDiagonalLength() {
        int[][] input = new int[][] {
                {3, 4}, // DL^2 = 25 & Area = 12 <****
                {4, 3}  // DL^2 = 25 & Area = 12 <****
        };
        assertEquals(12, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor3x2Array() {
        int[][] input = new int[][] {
                {1, 100}, // DL^2 = 10001 & Area = 100 <****
                {1, 99},  // DL^2 = 9801  & Area = 99
                {1, 98},  // DL^2 = 9604  & Area = 98
        };
        assertEquals(100, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor4x2Array() {
        int[][] input = new int[][] {
                {1, 2}, // DL^2 = 5 &  Area = 2
                {1, 2}, // DL^2 = 5 &  Area = 2
                {3, 4}, // DL^2 = 25 & Area = 12 <****
                {1, 2}  // DL^2 = 5 &  Area = 2
        };
        assertEquals(12, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor7x2Array() {
        int[][] input = new int[][] {
                {6,5},  // DL^2 = 61  & Area = 30
                {8,6},  // DL^2 = 100 & Area = 48
                {2,10}, // DL^2 = 104 & Area = 20 <****
                {8,1},  // DL^2 = 65  & Area = 8
                {9,2},  // DL^2 = 85  & Area = 18
                {3,5},  // DL^2 = 34  & Area = 15
                {3,5},  // DL^2 = 34  & Area = 15
        };
        assertEquals(20, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testAreaOfMaxDiagonalFor5x2Array() {
        int[][] input = new int[][] {
                {25, 60}, // DL^2 = 4225 & Area = 1500
                {1, 2},   // DL^2 = 2    & Area = 12
                {39, 52}, // DL^2 = 4225 & Area = 2028 <****
                {16, 63}, // DL^2 = 4225 & Area = 1008
                {33, 56}  // DL^2 = 4225 & Area = 1848
        };
        assertEquals(2028, solver.areaOfMaxDiagonal(input));
    }

    @Test
    void testStressTestRandomArrays() {
        Random rand = new Random(42); // fixed seed for reproducibility
        for (int n = 1; n <= 100; n++) {
            int[][] input = new int[n][2]; // Fixed cols of 2
            for (int i = 0; i < n; i++) {
                input[i][0] = rand.nextInt(100) + 1; // 1–100
                input[i][1] = rand.nextInt(100) + 1;
            }
            int expected = groundTruthAreaOfMaxDiagonal(input);
            int actual = solver.areaOfMaxDiagonal(input);
            assertEquals(expected, actual, "Failed at n=" + n);
        }
    }

    private int groundTruthAreaOfMaxDiagonal(int[][] dims) {
        int maxDiag = 0, bestArea = 0;
        for (int[] d : dims) {
            int diag = d[0]*d[0] + d[1]*d[1];
            int area = d[0]*d[1];
            if (diag > maxDiag || (diag == maxDiag && area > bestArea)) {
                maxDiag = diag;
                bestArea = area;
            }
        }
        return bestArea;
    }
}