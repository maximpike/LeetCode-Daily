package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    void testMaximumWealthTwoCustomersWithEqualWealth () {
        // input
        int[][] inputArray = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };
        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
        assertEquals(6, customerWealth.maximumWealth(inputArray));
    }

    @Test
    void testMaximumWealthTwoCustomers () {
        // input
        int[][] inputArray = new int[][]{
                {4, 8, 1},
                {3, 2, 1}
        };
        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
        assertEquals(13, customerWealth.maximumWealth(inputArray));
    }

    @Test
    void testMaximumWealthThreeCustomersWithTwoBanks () {
        // input
        int[][] inputArray = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };
        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
        assertEquals(10, customerWealth.maximumWealth(inputArray));
    }

    @Test
    void testMaximumWealthThreeCustomersWithThreeBanks () {
        // input
        int[][] inputArray = new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
        assertEquals(17, customerWealth.maximumWealth(inputArray));
    }
}