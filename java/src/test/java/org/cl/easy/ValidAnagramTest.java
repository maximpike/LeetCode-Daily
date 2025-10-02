package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram_example1() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram_solution1("anagram", "nagaram"));
        assertTrue(validAnagram.isAnagram_solution2("anagram", "nagaram"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertTrue(validAnagramReview.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram_example2() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram_solution1("rat", "car"));
        assertFalse(validAnagram.isAnagram_solution2("rat", "car"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertFalse(validAnagramReview.isAnagram("rat", "car"));
    }


    @Test
    void isAnagram_example3() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram_solution1("aacc", "ccac"));
        assertFalse(validAnagram.isAnagram_solution2("aacc", "ccac"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertFalse(validAnagramReview.isAnagram("aacc", "ccac"));
    }

    @Test
    void isAnagram_example4() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram_solution1("conversation", "conservation"));
        assertTrue(validAnagram.isAnagram_solution2("conversation", "conservation"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertTrue(validAnagramReview.isAnagram("conversation", "conservation"));
    }

    @Test
    void isAnagram_example5() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram_solution1("pseudopseudohypoparathyroidism", "floccinaucinihilipilification"));
        assertFalse(validAnagram.isAnagram_solution2("pseudopseudohypoparathyroidism", "floccinaucinihilipilification"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertFalse(validAnagramReview.isAnagram("pseudopseudohypoparathyroidism", "floccinaucinihilipilification"));
    }

    @Test
    void isAnagram_example6() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram_solution1("conversation", "voicesranton"));
        assertTrue(validAnagram.isAnagram_solution2("conversation", "voicesranton"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertTrue(validAnagramReview.isAnagram("conversation", "voicesranton"));
    }

    @Test
    void isAnagram_withStringDifferentLengths() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram_solution1("a", "ab"));
        assertFalse(validAnagram.isAnagram_solution2("a", "ab"));

//        ValidAnagramReview validAnagramReview = new ValidAnagramReview();
//        assertFalse(validAnagramReview.isAnagram("a", "ab"));
    }
}
