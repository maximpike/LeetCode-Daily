package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDifferenceTest {

    @Test
    void findTheDifference_example1() {

        FindDifference fd = new FindDifference();
        assertEquals('e', fd.findTheDifference("abcd", "abcde"));
    }

    @Test
    void findTheDifference_example2() {

        FindDifference fd = new FindDifference();
        assertEquals('y', fd.findTheDifference("", "y"));
    }
}