package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString_example1() {
        char[] s = {'h', 'e', 'l','l','o'};
        char[] expected = {'o', 'l', 'l','e','h'};
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    void reverseString_example2() {
        char[] s = {'H', 'a', 'n','n','a', 'h'};
        char[] expected = {'h', 'a', 'n','n','a', 'H'};
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    void reverseString_example3() {
        char[] s = {'M', 'a', 'x','i','m', 'i', 'l', 'i', 'a', 'n'};
        char[] expected =   {'n', 'a', 'i','l','i', 'm', 'i', 'x', 'a', 'M'};
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        assertArrayEquals(expected, s);
    }
}