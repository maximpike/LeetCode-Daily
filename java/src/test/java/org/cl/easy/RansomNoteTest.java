package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct_example1() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("a", "b"));
        assertFalse(rn.canConstruct_solution2("a", "b"));
    }

    @Test
    void canConstruct_example2() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("aa", "b"));
        assertFalse(rn.canConstruct_solution2("aa", "b"));
    }

    @Test
    void canConstruct_example3() {
        RansomNote rn =  new RansomNote();
        assertTrue(rn.canConstruct_solution1("aa", "aab"));
        assertTrue(rn.canConstruct_solution2("aa", "aab"));
    }

    @Test
    void canConstruct_example4() {
        RansomNote rn =  new RansomNote();
        assertTrue(rn.canConstruct_solution1("abbefhjklmmmmm", "aabbbbcdefghijklmmmmm"));
        assertTrue(rn.canConstruct_solution2("abbefhjklmmmmm", "aabbbbcdefghijklmmmmm"));
    }

    @Test
    void canConstruct_example5() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("abbefhjklmmmmmmmmmmm", "aabbbbcdefghijklmmmmm"));
        assertFalse(rn.canConstruct_solution2("abbefhjklmmmmmmmmmmm", "aabbbbcdefghijklmmmmm"));
    }
}