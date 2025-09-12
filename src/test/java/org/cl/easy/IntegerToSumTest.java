package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToSumTest {

    // Constraints n min = 2 & n max = 10^4 (10 000)

    @Test
    void testGetNoZeroIntegersMin() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(2);
    }

    @Test
    void testGetNoZeroIntegersMax() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(10000);
    }

    @Test
    void testGetNoZeroIntegersInput11() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(11);
    }

    @Test
    void testGetNoZeroIntegersInput21() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(21);
    }

    @Test
    void testGetNoZeroIntegersInput1010() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(1010);
    }

    @Test
    void testGetNoZeroIntegersInput4102() {
        IntegerToSum integerToSum = new IntegerToSum();
        integerToSum.getNoZeroIntegers(4102);
    }
}