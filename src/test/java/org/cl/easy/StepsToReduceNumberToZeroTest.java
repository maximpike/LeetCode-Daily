package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsToReduceNumberToZeroTest {

    @Test
    void testNumberOfSteps() {

        StepsToReduceNumberToZero steps = new StepsToReduceNumberToZero();
        assertEquals(6, steps.numberOfSteps(14));
        assertEquals(4, steps.numberOfSteps(8));
        assertEquals(12, steps.numberOfSteps(123));

    }
}