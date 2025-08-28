package org.cl.misc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TrimZerosTest {

    @Test
    void trimAllOuterZerosCase1() {
        int[] input = new int[]{0, 1, 1};
        int[] expected = new int[]{1, 1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase2() {
        int[] input = new int[]{1, 0, 1};
        int[] expected = new int[]{1, 0, 1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase3() {
        int[] input = new int[]{1, 1, 0};
        int[] expected = new int[]{1, 1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase4() {
        int[] input = new int[]{1, 1, 1};
        int[] expected = new int[]{1, 1, 1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase5() {
        int[] input = new int[]{0, 0, 0};
        int[] expected = new int[]{};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCas6() {
        int[] input = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = new int[]{};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase7() {
        int[] input = new int[]{0, 1, 0};
        int[] expected = new int[]{1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase8() {
        int[] input = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] expected = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase9() {
        int[] input = new int[]{0, 0, 1};
        int[] expected = new int[]{1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

    @Test
    void trimAllOuterZerosCase10() {
        int[] input = new int[]{1, 0, 0};
        int[] expected = new int[]{1};
        TrimZeros trimZeros = new TrimZeros();
        assertArrayEquals(expected, trimZeros.trimAllOuterZeros(input));
    }

}