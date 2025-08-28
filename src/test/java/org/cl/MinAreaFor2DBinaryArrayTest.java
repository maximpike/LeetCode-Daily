package org.cl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAreaFor2DBinaryArrayTest {

    @Test
    void minimumAreaFor2x2Matrix() {
        int[][] gridInput = new int[][] {
                {1,0},
                {0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(1, area.minimumArea(gridInput));
    }

    //This test case not applicable as implied in problem constraints
//    @Test
//    void minimumAreaFor2x2ZerosMatrix() {
//        int[][] gridInput = new int[][] {
//                {0,0},
//                {0,0},
//        };
//        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
//        assertEquals(1, area.minimumArea(gridInput));
//    }

    @Test
    void minimumAreaFor2x3MatrixCase1() {

        int[][] gridInput = new int[][] {
                {0,1,0},
                {1,0,1},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(6, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor2x3MatrixCase2() {

        int[][] gridInput = new int[][] {
                {0,1,0},
                {1,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(4, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor2x3MatrixCase3() {

        int[][] gridInput = new int[][] {
                {1,0,0},
                {0,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(1, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor2x3MatrixCase4() {

        int[][] gridInput = new int[][] {
                {1,1,0},
                {0,1,1},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(6, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x4Matrix() {

        int[][] gridInput = new int[][] {
                {0,1,0,0},
                {1,0,1,0},
                {0,0,0,0},
                {0,0,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(6, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x4MatrixCase2() {

        int[][] gridInput = new int[][] {
                {0,1,0,0},
                {1,0,1,0},
                {0,1,0,0},
                {0,0,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(9, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x4MatrixCase3() {

        int[][] gridInput = new int[][] {
                {0,1,0,0},
                {0,0,1,1},
                {0,1,0,0},
                {0,0,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(9, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x7MatrixCase3() {

        int[][] gridInput = new int[][] {
                {0,1,0,0,0,1,0},
                {1,0,1,0,0,0,0},
                {0,1,0,0,1,1,1},
                {0,0,0,0,0,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(21, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x3Matrix() {
        int[][] gridInput = new int[][] {
                {0,0,0},
                {0,0,1},
                {0,0,0},
                {1,0,0},
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(9, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor4x3MatrixCase3() {

        int[][] gridInput = new int[][] {
                {0,0,0},
                {0,0,0},
                {0,0,0},
                {0,1,0}
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(1, area.minimumArea(gridInput));
    }

    @Test
    void minimumAreaFor3x4MatrixCase3() {
        int[][] gridInput = new int[][] {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,1}
        };
        MinAreaFor2DBinaryArray area = new MinAreaFor2DBinaryArray();
        assertEquals(1, area.minimumArea(gridInput));
    }
}