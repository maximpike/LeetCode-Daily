package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountElementsMaxFrequencyTest {

    @Test
    void maxFrequencyElements_example1() {
        CountElementsMaxFrequency c = new CountElementsMaxFrequency();
        assertEquals(4, c.maxFrequencyElements(new int[] {1, 2, 2, 3, 1, 4}));
    }

    @Test
    void maxFrequencyElements_example2() {
        CountElementsMaxFrequency c = new CountElementsMaxFrequency();
        assertEquals(5, c.maxFrequencyElements(new int[] {1, 2, 3, 4, 5}));
    }
}