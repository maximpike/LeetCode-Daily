package org.cl.easy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPerfectSquareTest {

    @Test
    void testIsPerfectSquare_example1() {
        int num = 16;
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertTrue(vps.isPerfectSquare_solution1(num));
        assertTrue(vps.isPerfectSquare_solution2(num));
    }

    @Test
    void testIsPerfectSquare_example2() {
        int num = 14;
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertFalse(vps.isPerfectSquare_solution1(num));
        assertFalse(vps.isPerfectSquare_solution2(num));
    }

    @Test
    void testIsPerfectSquare_validSquares() {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertTrue(vps.isPerfectSquare_solution1(4));
        assertTrue(vps.isPerfectSquare_solution2(4));
        assertTrue(vps.isPerfectSquare_solution1(25));
        assertTrue(vps.isPerfectSquare_solution2(25));
        assertTrue(vps.isPerfectSquare_solution1(36));
        assertTrue(vps.isPerfectSquare_solution2(36));
        assertTrue(vps.isPerfectSquare_solution1(49));
        assertTrue(vps.isPerfectSquare_solution2(49));
        assertTrue(vps.isPerfectSquare_solution1(64));
        assertTrue(vps.isPerfectSquare_solution2(64));
        assertTrue(vps.isPerfectSquare_solution1(81));
        assertTrue(vps.isPerfectSquare_solution2(81));
        assertTrue(vps.isPerfectSquare_solution1(100));
        assertTrue(vps.isPerfectSquare_solution2(100));
    }

    @Test
    void testIsPerfectSquare_notValidSquares() {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertFalse(vps.isPerfectSquare_solution1(2));
        assertFalse(vps.isPerfectSquare_solution2(2));
        assertFalse(vps.isPerfectSquare_solution1(3));
        assertFalse(vps.isPerfectSquare_solution2(3));
        assertFalse(vps.isPerfectSquare_solution1(10));
        assertFalse(vps.isPerfectSquare_solution2(10));
        assertFalse(vps.isPerfectSquare_solution1(27));
        assertFalse(vps.isPerfectSquare_solution2(27));
        assertFalse(vps.isPerfectSquare_solution1(35));
        assertFalse(vps.isPerfectSquare_solution2(35));
        assertFalse(vps.isPerfectSquare_solution1(37));
        assertFalse(vps.isPerfectSquare_solution2(37));
        assertFalse(vps.isPerfectSquare_solution1(80));
        assertFalse(vps.isPerfectSquare_solution2(80));
        assertFalse(vps.isPerfectSquare_solution1(110));
        assertFalse(vps.isPerfectSquare_solution2(110));
    }

    @Test
    void testIsPerfectSquare_minNum() {
        int num = 1;
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertTrue(vps.isPerfectSquare_solution1(num));
        assertTrue(vps.isPerfectSquare_solution2(num));
    }

    @Test
    void testIsPerfectSquare_maxNum() {
        int num = 2147483647;
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertFalse(vps.isPerfectSquare_solution1(num));
        assertFalse(vps.isPerfectSquare_solution2(num));
    }

    @Test
    void testIsPerfectSquare_integerOverflow() {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        assertTrue(vps.isPerfectSquare_solution1(808201));
        assertTrue(vps.isPerfectSquare_solution2(808201));
    }

}