package org.cl.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ValueVariableAfterOperationsTest {

    @Test
    void testFinalValueAfterOperations_example1() {
        String[] operations = new String[]{"--X","X++","X++"};
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        assertEquals(1, vOp.finalValueAfterOperations_solution1(operations));
        assertEquals(1, vOp.finalValueAfterOperations_solution2(operations));
    }

    @Test
    void testFinalValueAfterOperations_example2() {
        String[] operations = new String[]{"++X","++X","X++"};
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        assertEquals(3, vOp.finalValueAfterOperations_solution2(operations));
    }

    @Test
    void testFinalValueAfterOperations_eExample3() {
        String[] operations = new String[]{"X++","++X","--X","X--"};
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        assertEquals(0, vOp.finalValueAfterOperations_solution2(operations));
    }

    @Test
    void testFinalValueAfterOperations_withMinNegativeArray() {
        String[] operations = new String[]{"--X"};
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        assertEquals(-1, vOp.finalValueAfterOperations_solution1(operations));
        assertEquals(-1, vOp.finalValueAfterOperations_solution2(operations));
    }

    @Test
    void testFinalValueAfterOperations_withMinPositiveArray() {
        String[] operations = new String[]{"X++"};
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        assertEquals(1, vOp.finalValueAfterOperations_solution1(operations));
        assertEquals(1, vOp.finalValueAfterOperations_solution2(operations));
    }

    @Test
    void testFinalValueAfterOperation_stressTest() {

        Random random = new Random(41); // fixed seed for reproducibility
        ValueVariableAfterOperations vOp = new ValueVariableAfterOperations();
        for (int n = 1; n < 100; n++) {
            String[] input = new String[n];
            for (int i = 0; i < n; i++) {
                int randomValue = random.nextInt(2); // Assign binary value to randomValue
                if (randomValue == 0) {
                    input[i] = "++X";
                }
                if (randomValue == 1) {
                    input[i] = "--X";
                }
            }
            int expected = groundTruthFinalValueAfterOperations(input);
            int actualSolution1 = vOp.finalValueAfterOperations_solution1(input);
            int actualSolution2 = vOp.finalValueAfterOperations_solution2(input);
//            System.out.println("Expected = " + expected + ", Actual = " + actual);
            assertEquals(expected, actualSolution1);
            assertEquals(expected, actualSolution2);
        }
    }

    private int groundTruthFinalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("+")) { x++; }
            if (operation.contains("-")) { x--; }
        }
        return x;
    }
}