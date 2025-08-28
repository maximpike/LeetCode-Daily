package org.cl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProblemMyProblemSubMatricesWithAllOnesTest {

    @Test
    void testNumSubmat1DMatrixInput1x1() {
        int[] inputOneBinArray = new int[] {1};
        int[] inputZeroBinArray = new int[] {0};
        MyProblemSubMatricesWithAllOnes s = new MyProblemSubMatricesWithAllOnes();
        assertEquals(1, s.numSubmat(inputOneBinArray));
        assertEquals(0, s.numSubmat(inputZeroBinArray));
    }

    @Test
    void testNumSubmat1DMatrixInput1x2() {
        int[] inputBinArray1 = new int[] {1, 0};
        int[] inputBinArray2 = new int[] {0, 1};
        int[] inputBinArray3 = new int[] {1, 1};
        int[] inputBinArray4 = new int[] {0, 0};
        MyProblemSubMatricesWithAllOnes s = new MyProblemSubMatricesWithAllOnes();
        assertEquals(1, s.numSubmat(inputBinArray1));
        assertEquals(1, s.numSubmat(inputBinArray2));
        assertEquals(3, s.numSubmat(inputBinArray3));
        assertEquals(0, s.numSubmat(inputBinArray4));
    }

    @Test
    void testNumSubmat1DMatrixInput1x3() {
        int[][] inputsMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 0},
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[] expectedResults = {1, 1, 1, 3, 3, 2, 6, 0};

        MyProblemSubMatricesWithAllOnes s = new MyProblemSubMatricesWithAllOnes();

        for (int i =0; i<inputsMatrix.length; i++) {
            assertEquals(expectedResults[i], s.numSubmat(inputsMatrix[i]), "Failed on input index: " + i );
        }
    }

    @Test
    void testNumSubmat1DMatrixInput1x4() {
        int[][] inputsMatrix = {
                {1, 0, 0, 0}, // 1  -> 1
                {0, 1, 0, 0}, // 2  -> 1
                {0, 0, 1, 0}, // 3  -> 1
                {0, 0, 0, 1}, // 4  -> 1
                {1, 1, 0, 0}, // 5  -> 3
                {0, 1, 1, 0}, // 6  -> 3
                {0, 0, 1, 1}, // 7  -> 3
                {1, 0, 0, 1}, // 8  -> 2
                {1, 0, 1, 0}, // 9  -> 2
                {0, 1, 0, 1}, // 10 -> 2
                {1, 1, 1, 0}, // 11 -> 6
                {0, 1, 1, 1}, // 12 -> 6
                {1, 0, 1, 1}, // 13 -> 4
                {1, 1, 0, 1}, // 14 -> 4
                {1, 1, 1, 1}, // 15 -> 10
                {0, 0, 0, 0}, // 16 -> 0
        };
        int[] expectedResults = {1, 1, 1, 1, 3, 3, 3, 2, 2, 2, 6, 6, 4, 4, 10, 0};
        MyProblemSubMatricesWithAllOnes s = new MyProblemSubMatricesWithAllOnes();
        for (int i = 0; i<inputsMatrix.length; i++) {
            assertEquals(expectedResults[i], s.numSubmat(inputsMatrix[i]), "Failed at index: " + i);
        }
    }

    @Test
    void testNumSubmat1DMatrixInput1x5() {
        int[][] inputsMatrix = {
                {1, 0, 0, 0, 0}, // 1  -> 1
                {0, 1, 0, 0, 0}, // 2  -> 1
                {0, 0, 1, 0, 0}, // 3  -> 1
                {0, 0, 0, 1, 0}, // 4  -> 1
                {0, 0, 0, 0, 1}, // 5  -> 1
                {1, 1, 0, 0, 0}, // 6  -> 3
                {1, 0, 1, 0, 0}, // 7  -> 2
                {1, 0, 0, 1, 0}, // 8  -> 2
                {1, 0, 0, 0, 1}, // 9  -> 2
                {0, 1, 1, 0, 0}, // 10 -> 3
                {0, 1, 0, 1, 0}, // 11 -> 2
                {0, 1, 0, 0, 1}, // 12 -> 2
                {0, 0, 1, 1, 0}, // 13 -> 3
                {0, 0, 1, 0, 1}, // 14 -> 2
                {0, 0, 0, 1, 1}, // 15 -> 3
                {1, 1, 1, 0, 0}, // 16 -> 6
                {1, 0, 1, 1, 0}, // 17 -> 4
                {1, 0, 0, 1, 1}, // 18 -> 4
                {0, 1, 1, 1, 0}, // 19 -> 6
                {0, 1, 0, 1, 1}, // 20 -> 4
                {0, 0, 1, 1, 1}, // 21 -> 6
                {1, 1, 1, 1, 0}, // 22 -> 10
                {0, 1, 1, 1, 1}, // 23 -> 10
                {1, 1, 1, 1, 1}, // 24 -> 15
                {0, 0, 0, 0, 0}, // 25 -> 0
        };
        int[] expectedResults = {1, 1, 1, 1, 1, 3, 2, 2, 2, 3, 2, 2, 3, 2, 3, 6, 4, 4, 6, 4, 6, 10, 10, 15, 0};
        MyProblemSubMatricesWithAllOnes s = new MyProblemSubMatricesWithAllOnes();
        for (int i = 0; i<inputsMatrix.length; i++) {
            assertEquals(expectedResults[i], s.numSubmat(inputsMatrix[i]), "Failed at index: " + i);
        }
    }
}