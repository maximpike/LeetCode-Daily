package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @Test
    void testGuessNumber_example1() {
        GuessNumberHigherOrLower g = new GuessNumberHigherOrLower(6);
        assertEquals(6, g.guessNumber(10));
    }

    @Test
    void testGuessNumber_example2() {
        GuessNumberHigherOrLower g = new GuessNumberHigherOrLower(1);
        assertEquals(1, g.guessNumber(1));
    }

    @Test
    void testGuessNumber_example3() {
        GuessNumberHigherOrLower g = new GuessNumberHigherOrLower(1);
        assertEquals(1, g.guessNumber(2));
    }

    @Test
    void testGuessNumber_example4() {
        GuessNumberHigherOrLower g = new GuessNumberHigherOrLower(14678);
        assertEquals(14678, g.guessNumber(802765));
    }
}