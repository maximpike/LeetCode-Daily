package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max69NumberTest {

    @Test
    void maximum69Number_solution1_withOneDigit() {
        Max69Number max69Number = new Max69Number();
        assertEquals(9, max69Number.maximum69Number_solution1(9));
        assertEquals(9, max69Number.maximum69Number_solution1(6));
    }

    @Test
    void maximum69Number_solution1_withTwoDigits() {
        Max69Number max69Number = new Max69Number();
        assertEquals(96, max69Number.maximum69Number_solution1(66));
        assertEquals(99, max69Number.maximum69Number_solution1(69));
        assertEquals(99, max69Number.maximum69Number_solution1(96));
        assertEquals(99, max69Number.maximum69Number_solution1(99));
    }

    @Test
    void maximum69Number_solution1_withThreeDigits() {
        Max69Number max69Number = new Max69Number();
        assertEquals(966, max69Number.maximum69Number_solution1(666));
        assertEquals(969, max69Number.maximum69Number_solution1(669));
        assertEquals(996, max69Number.maximum69Number_solution1(696));
        assertEquals(996, max69Number.maximum69Number_solution1(966));
        assertEquals(999, max69Number.maximum69Number_solution1(699));
        assertEquals(999, max69Number.maximum69Number_solution1(969));
        assertEquals(999, max69Number.maximum69Number_solution1(996));
        assertEquals(999, max69Number.maximum69Number_solution1(999));
    }

    @Test
    void maximum69Number_solution1_withFourDigits() {
        Max69Number max69Number = new Max69Number();
        assertEquals(9666, max69Number.maximum69Number_solution1(6666));
        assertEquals(9669, max69Number.maximum69Number_solution1(6669));
        assertEquals(9696, max69Number.maximum69Number_solution1(6696));
        assertEquals(9966, max69Number.maximum69Number_solution1(6966));
        assertEquals(9966, max69Number.maximum69Number_solution1(9666));
        assertEquals(9999, max69Number.maximum69Number_solution1(9996));
        assertEquals(9999, max69Number.maximum69Number_solution1(9969));
        assertEquals(9999, max69Number.maximum69Number_solution1(9699));
        assertEquals(9999, max69Number.maximum69Number_solution1(9999));
    }
}