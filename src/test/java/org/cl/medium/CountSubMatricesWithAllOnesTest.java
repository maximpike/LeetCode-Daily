package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSubMatricesWithAllOnesTest {

    @Test
    void numSubmat1x1_Matrix() {
        int[][] inputMatrix = new int[][]{
                {0}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(0, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat1x2_ZerosMatrix() {
        int[][] inputMatrix = new int[][]{
                {0,0}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(0, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat1x2_BinaryMatrix() {
        int[][] inputMatrix = new int[][]{
                {0,1}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(1, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat1x2_OnesMatrix() {
        int[][] inputMatrix = new int[][]{
                {1,1}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(3, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat1x3_OnesMatrix() {
        int[][] inputMatrix = new int[][]{
                {1,1,1}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(6, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat2x2_OnesMatrix() {
        int[][] inputMatrix = new int[][]{
                {1,1},
                {1,1}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(9, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat2x2_BinaryMatrix() {
        int[][] inputMatrix = new int[][]{
                {1,0},
                {1,1}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(5, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat3x3_BinaryMatrix() {
        int[][] inputMatrix = new int[][]{
                {1,0,1},
                {1,1,0},
                {1,1,0}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(13, s.numSubmat(inputMatrix));
    }

    @Test
    void numSubmat3x4_BinaryMatrix() {
        int[][] inputMatrix = new int[][]{
                {0,1,1,0},
                {0,1,1,1},
                {1,1,1,0}
        };
        CountSubMatricesWithAllOnes s = new CountSubMatricesWithAllOnes();
        assertEquals(24, s.numSubmat(inputMatrix));
    }

}