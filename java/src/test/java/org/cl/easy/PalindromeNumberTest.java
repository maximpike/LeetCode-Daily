package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome_example1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void isPalindrome_example2() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(123));
    }

    @Test
    void isPalindrome_example3() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void isPalindrome_example4() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(22222));
    }
}