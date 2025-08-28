package org.cl.easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Solution 1
//        int richestCustomer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int result = 0; // reset wealth to 0 for each customer (temp var only avail within for)
            System.out.println("Evaluating Customer " + i);

            for (int j = 0; j < accounts[0].length; j++) {
                result += accounts[i][j];
                if (result > maxWealth) {
                    maxWealth = result;
//                    richestCustomer = i;
                }
            }
            System.out.println("Customer " + i + " wealth: " + result);
        }
//        System.out.println("The Richest Customer is: " + richestCustomer); // Functionality doesn't cover equal customer wealth
        System.out.println("With a Maximum Wealth of: " + maxWealth);

        // Time Complexity: O(m x n)
        // Space Complexity: O(1)

//        // Solution 2
//        for(int[] customer : accounts) {
//            int currentCustomerWealth = 0;
//
//            for (int bank : customer) {
//                currentCustomerWealth += bank;
//            }
//            maxWealth = Math.max(maxWealth, currentCustomerWealth); // Removes if logic in Sol 1
//        }
//        // Time Complexity: O(m x n)
//        // Space Complexity: O(1)
        return maxWealth;
    }
}
