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
}