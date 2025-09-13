package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreAStringTest {

    ScoreAString scoreAString;

    @BeforeEach
    void setUp() {
        scoreAString = new ScoreAString();
    }

    @Test
    void testScoreOfString_ab() {
        assertEquals(1, scoreAString.scoreOfString_solution1("ab"));
        assertEquals(1, scoreAString.scoreOfString_solution2("ab"));
        assertEquals(1, scoreAString.scoreOfString_solution3("ab"));
    }

    @Test
    void testScoreOfString_ba() {
        assertEquals(1, scoreAString.scoreOfString_solution1("ba"));
        assertEquals(1, scoreAString.scoreOfString_solution2("ba"));
        assertEquals(1, scoreAString.scoreOfString_solution3("ba"));
    }

    @Test
    void testScoreOfString_withCapitals() {
        assertEquals(13, scoreAString.scoreOfString_solution1("HELLO"));
        assertEquals(13, scoreAString.scoreOfString_solution2("HELLO"));
        assertEquals(13, scoreAString.scoreOfString_solution3("HELLO"));
    }

    @Test
    void testScoreOfString_hello() {
        assertEquals(13, scoreAString.scoreOfString_solution1("hello"));
        assertEquals(13, scoreAString.scoreOfString_solution2("hello"));
        assertEquals(13, scoreAString.scoreOfString_solution3("hello"));
    }

    @Test
    void testScoreOfString_zaz() {
        assertEquals(50, scoreAString.scoreOfString_solution1("zaz"));
        assertEquals(50, scoreAString.scoreOfString_solution2("zaz"));
        assertEquals(50, scoreAString.scoreOfString_solution3("zaz"));
    }

    @Test
    void testScoreOfString_maximilian() {
        assertEquals(85, scoreAString.scoreOfString_solution1("maximilian"));
        assertEquals(85, scoreAString.scoreOfString_solution2("maximilian"));
        assertEquals(85, scoreAString.scoreOfString_solution3("maximilian"));
    }

    @Test
    void testScoreOfString_pneumonoultramicroscopicsilicovolcanoconiosi() {
        // Definition of pneumonoultramicroscopicsilicovolcanoconiosi (longest word found in major English dictionary's)
        // -> an invented long word said to mean a lung disease caused by inhaling very fine ash and sand dust.
        assertEquals(309, scoreAString.scoreOfString_solution1("pneumonoultramicroscopicsilicovolcanoconiosi"));
        assertEquals(309, scoreAString.scoreOfString_solution2("pneumonoultramicroscopicsilicovolcanoconiosi"));
        assertEquals(309, scoreAString.scoreOfString_solution3("pneumonoultramicroscopicsilicovolcanoconiosi"));
    }

    @Test
    void testScoreOfString_supercalifragilisticexpialidocious() {
        assertEquals(242, scoreAString.scoreOfString_solution1("supercalifragilisticexpialidocious"));
        assertEquals(242, scoreAString.scoreOfString_solution2("supercalifragilisticexpialidocious"));
        assertEquals(242, scoreAString.scoreOfString_solution3("supercalifragilisticexpialidocious"));
    }

    @Test
    void testScoreOfString_stressTest() {
        Random random = new Random(25); // fixed seed for reproducibility
        for (int n = 2; n <= 100; n++) {
            char[] input = new char[n]; // USe array list rather
            for (int i = 0; i < n; i++) {
                input[i] = (char) random.nextInt(97, 123);// bound - exclusive;
            }
            String s = new String(input);
            int expected = groundTruthScoreOfString(s);
            assertEquals(expected, scoreAString.scoreOfString_solution1(s));
            assertEquals(expected, scoreAString.scoreOfString_solution2(s));
            assertEquals(expected, scoreAString.scoreOfString_solution3(s));
        }
    }

    private int groundTruthScoreOfString(String s){
        int score = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}