package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {

    AddTwoIntegers addTwoIntegers;

    @BeforeEach
    void setUp() {
        addTwoIntegers = new AddTwoIntegers();
    }

    @Test
    void testSum_example1() {
        assertEquals(17, addTwoIntegers.sum(12, 5));
    }

    @Test
    void testSum_example2() {
        assertEquals(-6, addTwoIntegers.sum(-10, 4));
    }

    @Test
    void testSum_withMaxValues() {
        assertEquals(200, addTwoIntegers.sum(100, 100));
    }

    @Test
    void testSum_withMinValues() {
        assertEquals(-200, addTwoIntegers.sum(-100, -100));
    }
}