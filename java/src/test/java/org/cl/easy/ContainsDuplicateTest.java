package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate_example1() {
        ContainsDuplicate cd = new ContainsDuplicate();
        assertTrue(cd.containsDuplicate_solution1(new int[]{1, 2, 3, 1}));
        assertTrue(cd.containsDuplicate_solution2(new int[]{1, 2, 3, 1}));

//        ContainsDuplicateReview cdr = new ContainsDuplicateReview();
//        assertTrue(cdr.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void containsDuplicate_example2() {
        ContainsDuplicate cd = new ContainsDuplicate();
        assertFalse(cd.containsDuplicate_solution1(new int[]{1, 2, 3, 4}));
        assertFalse(cd.containsDuplicate_solution2(new int[]{1, 2, 3, 4}));

//        ContainsDuplicateReview cdr = new ContainsDuplicateReview();
//        assertFalse(cdr.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void containsDuplicate_example3() {
        ContainsDuplicate cd = new ContainsDuplicate();
        assertTrue(cd.containsDuplicate_solution1(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        assertTrue(cd.containsDuplicate_solution2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

//        ContainsDuplicateReview cdr = new ContainsDuplicateReview();
//        assertTrue(cdr.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void containsDuplicate_example4() {
        ContainsDuplicate cd = new ContainsDuplicate();
        assertFalse(cd.containsDuplicate_solution1(new int[]{-2, -1, 0, 1, 2}));
        assertFalse(cd.containsDuplicate_solution2(new int[]{-2, -1, 0, 1, 2}));

//        ContainsDuplicateReview cdr = new ContainsDuplicateReview();
//        assertFalse(cdr.containsDuplicate(new int[]{-2, -1, 0, 1, 2}));
    }

    @Test
    void containsDuplicate_example5() {
        ContainsDuplicate cd = new ContainsDuplicate();
        assertTrue(cd.containsDuplicate_solution1(new int[]{-1, 0, -1, 0}));
        assertTrue(cd.containsDuplicate_solution2(new int[]{-1, 0, -1, 0}));

//        ContainsDuplicateReview cdr = new ContainsDuplicateReview();
//        assertTrue(cdr.containsDuplicate(new int[]{-1, 0, -1, 0}));
    }
}