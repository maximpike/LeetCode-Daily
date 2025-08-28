package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testFizzBuzzGeneratorForInput3() {
        int input = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator(input));
    }

    @Test
    void testFizzBuzzGeneratorForInput5() {
        int input = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator(input));
    }

    @Test
    void testFizzBuzzGeneratorForInput15() {
        int input = 15;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator(input));
    }

    @Test
    void testFizzBuzzGeneratorForInput1() {
        int input = 1;
        List<String> expected = List.of("1");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator(input));
    }

    @Test
    void testFizzBuzzGenerator_stressTestForInput10000() {
        int input = 10_000;
        List<String> result = fizzBuzz.fizzBuzzGenerator(input);

        // Check the size
        assertEquals(input, result.size());

        // Optional spot checks
        assertEquals("1", result.get(0));           // 1st element
        assertEquals("Fizz", result.get(2));        // 3rd element
        assertEquals("Buzz", result.get(4));        // 5th element
        assertEquals("FizzBuzz", result.get(14));   // 15th element
        assertEquals("FizzBuzz", result.get(269));  // 270th element
        assertEquals("511", result.get(510));       // 511th element
        assertEquals("Buzz", result.get(9999));     // 10,000th element divisible by 5
    }
}