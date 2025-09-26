package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    @Test
    void getConcatenation_1x3Array() {
        int[] nums = new int[]{1, 2, 1};
        int[] expected = new int[]{1, 2, 1, 1, 2, 1};
        ConcatenationOfArray c = new ConcatenationOfArray();
        assertEquals(expected.length, c.getConcatenation_solution1(nums).length);
        assertEquals(expected.length, c.getConcatenation_solution2(nums).length);
        assertArrayEquals(expected, c.getConcatenation_solution1(nums));
        assertArrayEquals(expected, c.getConcatenation_solution2(nums));
    }

    @Test
    void getConcatenation_1x4Array() {
        int[] nums = new int[]{1, 3, 2, 1};
        int[] expected = new int[]{1, 3, 2, 1, 1, 3, 2, 1};
        ConcatenationOfArray c = new ConcatenationOfArray();
        assertEquals(expected.length, c.getConcatenation_solution1(nums).length);
        assertEquals(expected.length, c.getConcatenation_solution2(nums).length);
        assertArrayEquals(expected, c.getConcatenation_solution1(nums));
        assertArrayEquals(expected, c.getConcatenation_solution2(nums));
    }

    @Test
    void getConcatenation_1x5Array() {
        int[] nums = new int[]{103, 301, 222, 103, 600};
        int[] expected = new int[]{103, 301, 222, 103, 600, 103, 301, 222, 103, 600};
        ConcatenationOfArray c = new ConcatenationOfArray();
        assertEquals(expected.length, c.getConcatenation_solution1(nums).length);
        assertEquals(expected.length, c.getConcatenation_solution2(nums).length);
        assertArrayEquals(expected, c.getConcatenation_solution1(nums));
        assertArrayEquals(expected, c.getConcatenation_solution2(nums));
    }

    @Test
    void getConcatenation_1x6Array() {
        int[] nums = new int[]{1, 21, 400, 5, 1, 999};
        int[] expected = new int[]{1, 21, 400, 5, 1, 999, 1, 21, 400, 5, 1, 999};
        ConcatenationOfArray c = new ConcatenationOfArray();
        assertEquals(expected.length, c.getConcatenation_solution1(nums).length);
        assertEquals(expected.length, c.getConcatenation_solution2(nums).length);
        assertArrayEquals(expected, c.getConcatenation_solution1(nums));
        assertArrayEquals(expected, c.getConcatenation_solution2(nums));
    }

    // TODO: create stress test
}