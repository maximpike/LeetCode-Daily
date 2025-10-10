package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDifferenceTest {

    @Test
    void findTheDifference_example1() {
        FindDifference fd = new FindDifference();
        assertEquals('e', fd.findTheDifference_solution1("abcd", "abcde"));
        assertEquals('e', fd.findTheDifference_solution2("abcd", "abcde"));
    }

    @Test
    void findTheDifference_example2() {
        FindDifference fd = new FindDifference();
        assertEquals('y', fd.findTheDifference_solution1("", "y"));
        assertEquals('y', fd.findTheDifference_solution2("", "y"));
    }

    @Test
    void findTheDifference_example3() {
        FindDifference fd = new FindDifference();
        assertEquals('a', fd.findTheDifference_solution1("a", "aa"));
        assertEquals('a', fd.findTheDifference_solution2("a", "aa"));
    }
}