package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber_example1() {
        MissingNumber m = new MissingNumber();
        assertEquals(2, m.missingNumber_solution1(new int[]{3,0,1}));
    }

    @Test
    void missingNumber_example2() {
        MissingNumber m = new MissingNumber();
        assertEquals(2, m.missingNumber_solution1(new int[]{0,1}));
    }

    @Test
    void missingNumber_example3() {
        MissingNumber m = new MissingNumber();
        assertEquals(8, m.missingNumber_solution1(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    @Test
    void missingNumber_example4() {
        MissingNumber m = new MissingNumber();
        assertEquals(0, m.missingNumber_solution1(new int[]{1,2}));
    }
}