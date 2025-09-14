package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestEvenMultipleTest {

    @Test
    void testSmallestEvenMultiple_example1() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(10, s.smallestEvenMultiple_solution1(5));
        assertEquals(10, s.smallestEvenMultiple_solution2(5));
    }

    @Test
    void testSmallestEvenMultiple_example2() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(6, s.smallestEvenMultiple_solution1(6));
        assertEquals(6, s.smallestEvenMultiple_solution2(6));
    }

    @Test
    void testSmallestEvenMultiple_example3() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(246, s.smallestEvenMultiple_solution1(123));
        assertEquals(246, s.smallestEvenMultiple_solution2(123));
    }

    @Test
    void testSmallestEvenMultiple_example4() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(88, s.smallestEvenMultiple_solution1(88));
        assertEquals(88, s.smallestEvenMultiple_solution2(88));
    }

    @Test
    void testSmallestEvenMultiple_Min() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(2, s.smallestEvenMultiple_solution1(1));
        assertEquals(2, s.smallestEvenMultiple_solution2(1));
    }

    @Test
    void testSmallestEvenMultiple_Max() {
        SmallestEvenMultiple s = new SmallestEvenMultiple();
        assertEquals(150, s.smallestEvenMultiple_solution1(150));
        assertEquals(150, s.smallestEvenMultiple_solution2(150));
    }
}