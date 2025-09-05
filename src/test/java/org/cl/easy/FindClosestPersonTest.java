package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link FindClosestPerson}.
 *
 * Test method names follow a behaviour-driven style:
 *   shouldReturn<ExpectedResult>_when<Condition>
 *
 * This convention is common in modern Java testing (see ThoughtWorks,
 * Google Testing Blog, and Behaviour-Driven Development practices).
 * It emphasizes behaviour and intent over implementation.
 */
class FindClosestPersonTest {

    FindClosestPerson findClosestPerson;
    @BeforeEach
    void setUp() {
        findClosestPerson = new FindClosestPerson();
    }

    // One closer
    @Test
    void shouldReturn1_whenPerson1Closest() {
        // inputs
        int x = 2; // Person 1
        int y = 7; // Person 2
        int z = 4; // Person 3
        assertEquals(1, findClosestPerson.findClosest(x,y,z));
        // Explanation
        // Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
        // Person 2 is at position 7 and can reach Person 3 in 3 steps.
        // Since Person 1 reaches Person 3 first, the output is 1.
    }

    @Test
    void shouldReturn2_whenPerson2Closest() {
        assertEquals(2, findClosestPerson.findClosest(2,5,6));
    }

    // Equal distance
    @Test
    void shouldReturn0_whenPerson1AndPerson2Equal() {
        assertEquals(0, findClosestPerson.findClosest(1,5,3));
    }

    // At Target (i.e. At Person 3)
    @Test
    void shouldReturn1_whenPerson1AtTargetAndPerson2Not() {
        assertEquals(1, findClosestPerson.findClosest(1, 5, 1));
    }

    @Test
    void shouldReturn2_whenPerson2AtTargetAndPerson1Not() {
        assertEquals(2, findClosestPerson.findClosest(1, 5, 5));
    }

    // Boundary cases
    @Test
    void shouldReturn0_whenPerson1AndPerson2EqualMinValues() {
        assertEquals(0, findClosestPerson.findClosest(1,1,1));
    }

    @Test
    void shouldReturn0_whenPerson1AndPerson2EqualMaxValues() {
        assertEquals(0, findClosestPerson.findClosest(100,100,100));
    }
}