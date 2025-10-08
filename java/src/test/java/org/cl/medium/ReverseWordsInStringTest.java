package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {

    @Test
    void reverseWords_example1() {
        String s = "the sky is blue";
        ReverseWordsInString rws = new ReverseWordsInString();
        assertEquals("blue is sky the", rws.reverseWords_solution1(s));
        assertEquals("blue is sky the", rws.reverseWords_solution3(s));
    }

    @Test
    void reverseWords_example2() {
        String s = "  hello world  ";
        ReverseWordsInString rws = new ReverseWordsInString();
        assertEquals("world hello", rws.reverseWords_solution1(s));
        assertEquals("world hello", rws.reverseWords_solution3(s));
    }

    @Test
    void reverseWords_example3() {
        String s = "a good  example";
        ReverseWordsInString rws = new ReverseWordsInString();
        assertEquals("example good a", rws.reverseWords_solution1(s));
        assertEquals("example good a", rws.reverseWords_solution3(s));
    }
}