package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {

    @Test
    void testIsPowerOfFourEvenCasesReturnTrue() {
        PowerOfFour pf = new PowerOfFour();
        assertTrue(pf.isPowerOfFour(1));
        assertTrue(pf.isPowerOfFour(4));
        assertTrue(pf.isPowerOfFour(16));
        assertTrue(pf.isPowerOfFour(64));
    }

    @Test
    void testIsPowerOfFourOddNumberCasesReturnFalse() {
        PowerOfFour pf = new PowerOfFour();
        assertFalse(pf.isPowerOfFour(2));
        assertFalse(pf.isPowerOfFour(3));
        assertFalse(pf.isPowerOfFour(5));
        assertFalse(pf.isPowerOfFour(17));
        assertFalse(pf.isPowerOfFour(63));
    }

    @Test
    void testIsPowerOfFourNegativeCasesReturnFalse() {
        PowerOfFour pf = new PowerOfFour();
        assertFalse(pf.isPowerOfFour(0));
        assertFalse(pf.isPowerOfFour(-1));
        assertFalse(pf.isPowerOfFour(-200));
        assertFalse(pf.isPowerOfFour(-2147483648));
    }

    @Test
    void testIsPowerOfFourEvenNumberCasesReturnFalse() {
        PowerOfFour pf = new PowerOfFour();
        assertFalse(pf.isPowerOfFour(8));
        assertFalse(pf.isPowerOfFour(12));
        assertFalse(pf.isPowerOfFour(20));
        assertFalse(pf.isPowerOfFour(24));
        assertFalse(pf.isPowerOfFour(28));
        assertFalse(pf.isPowerOfFour(32));
    }

}