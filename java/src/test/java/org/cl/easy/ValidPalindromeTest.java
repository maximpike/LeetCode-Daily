package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome_example1() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome_solution1("A man, a plan, a canal: Panama"));
        assertTrue(vp.isPalindrome_solution2("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_example2() {
        ValidPalindrome vp = new ValidPalindrome();
        assertFalse(vp.isPalindrome_solution1("race a car"));
        assertFalse(vp.isPalindrome_solution2("race a car"));
    }

    @Test
    void isPalindrome_example3() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome_solution1(" "));
        assertTrue(vp.isPalindrome_solution2(" "));
    }

    @Test
    void isPalindrome_example4() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome_solution1("racecar"));
        assertTrue(vp.isPalindrome_solution2("racecar"));
    }

    @Test
    void isPalindrome_example5() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome_solution1("12345678900987654321"));
        assertTrue(vp.isPalindrome_solution2("12345678900987654321"));
    }

    @Test
    void isPalindrome_example6() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome_solution1("1234567890987654321"));
        assertTrue(vp.isPalindrome_solution2("1234567890987654321"));
    }

    @Test
    void isPalindrome_example7() {
        ValidPalindrome vp = new ValidPalindrome();
        assertFalse(vp.isPalindrome_solution1("123421"));
        assertFalse(vp.isPalindrome_solution2("123421"));
    }
}