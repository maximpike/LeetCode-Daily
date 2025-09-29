package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram_example1() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram_example2() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }

    @Test
    void isAnagram_withStringDifferentLengths() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("a", "ab"));
    }

    @Test
    void isAnagram_example3() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("aacc", "ccac"));
    }

    @Test
    void isAnagram_example4() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("conversation", "conservation"));
    }

    @Test
    void isAnagram_example5() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("pseudopseudohypoparathyroidism", "floccinaucinihilipilification"));
    }

    @Test
    void isAnagram_example6() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("conversation", "voices rant on"));
    }
}