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
    void testFizzBuzzGenerator_withInput3() {
        List<String> expected = List.of("1", "2", "Fizz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution1(3));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution2(3));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution3(3));
    }

    @Test
    void testFizzBuzzGenerator_withInput5() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution1(5));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution2(5));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution3(5));
    }

    @Test
    void testFizzBuzzGenerator_withInput15() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution1(15));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution2(15));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution3(15));
    }

    @Test
    void testFizzBuzzGenerator_withMinInput() {
        List<String> expected = List.of("1");
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution1(1));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution2(1));
        assertEquals(expected, fizzBuzz.fizzBuzzGenerator_solution3(1));
    }

    @Test
    void testFizzBuzzGenerator_stressTest_withMaxInput() {
        List<String> result = fizzBuzz.fizzBuzzGenerator_solution1(10_000); // n=10^4

        // Check the size
        assertEquals(10_000, result.size());

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