package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct_example1() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("a", "b"));

//        RansomNoteReview rnr = new RansomNoteReview();
//        assertFalse(rnr.canConstruct("a", "b"));
    }

    @Test
    void canConstruct_example2() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("aa", "b"));

//        RansomNoteReview rnr = new RansomNoteReview();
//        assertFalse(rnr.canConstruct("aa", "b"));
    }

    @Test
    void canConstruct_example3() {
        RansomNote rn =  new RansomNote();
        assertTrue(rn.canConstruct_solution1("aa", "aab"));

//        RansomNoteReview rnr = new RansomNoteReview();
//        assertTrue(rnr.canConstruct("aa", "aab"));
    }


    @Test
    void canConstruct_example4() {
        RansomNote rn =  new RansomNote();
        assertTrue(rn.canConstruct_solution1("abbefhjklmmmmm", "aabbbbcdefghijklmmmmm"));

//        RansomNoteReview rnr = new RansomNoteReview();
//        assertTrue(rnr.canConstruct("abbefhjklmmmmm", "aabbbbcdefghijklmmmmm"));
    }

    @Test
    void canConstruct_example5() {
        RansomNote rn =  new RansomNote();
        assertFalse(rn.canConstruct_solution1("abbefhjklmmmmmmmmmmm", "aabbbbcdefghijklmmmmm"));

//        RansomNoteReview rnr = new RansomNoteReview();
//        assertFalse(rnr.canConstruct("abbefhjklmmmmmmmmmmm", "aabbbbcdefghijklmmmmm"));
    }
}