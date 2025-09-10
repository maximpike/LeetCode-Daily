package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEqualAndDivInArrayTest {

    @Test
    void testCountPairs_input1x2Array_withNoPairs() {
        int [] inputArray = {1,2};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(0,countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairs_input1x2Array_withOnePair() {
        int [] inputArray = {2,2};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(1,countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairs_input1x2Array_withPair() {
        int [] inputArray = {1,1};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(1,countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairsExample1() {
        int [] inputArray = {3,1,2,2,2,1,3};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(4, countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairsExample2() {
        int [] inputArray = {1,2,3,4};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(0,countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairs_withMinNumsArray() {
        int[] inputArray = {1};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(0,countEqualAndDivInArray.countPairs(inputArray,2));
    }

    @Test
    void testCountPairs_with1x10_withTenPairs() {
        int[] inputArray = {10,10,10,10,10,10,10,10,10,10};
        CountEqualAndDivInArray countEqualAndDivInArray = new CountEqualAndDivInArray();
        assertEquals(45,countEqualAndDivInArray.countPairs(inputArray,1));
    }

//    TODO: create stress test with Max Array length
    @Test
    void testCountPairs_withMaxNumsArray() {
        // Will need to create input array with 100 elements
//        int[] inputArray = {};

    }
}