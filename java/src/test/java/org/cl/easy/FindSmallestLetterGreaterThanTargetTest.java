package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestLetterGreaterThanTargetTest {

    @Test
    void testNextGreatestLetter_example1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        assertEquals('c', f.nextGreatestLetter(letters, target));
    }

    @Test
    void testNextGreatestLetter_example2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        assertEquals('f', f.nextGreatestLetter(letters, target));
    }

    @Test
    void testNextGreatestLetter_exampl3() {
        char[] letters ={'x', 'x', 'y', 'y'};
        char target = 'z';
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        assertEquals('x', f.nextGreatestLetter(letters, target));
    }

    @Test
    void testNextGreatestLetter_example4() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        assertEquals('f', f.nextGreatestLetter(letters, target));
    }

    @Test
    void testNextGreatestLetter_example5() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'g';
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        assertEquals('j', f.nextGreatestLetter(letters, target));
    }
}
