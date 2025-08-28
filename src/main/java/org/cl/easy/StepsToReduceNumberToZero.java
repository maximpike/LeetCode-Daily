package org.cl.easy;

public class StepsToReduceNumberToZero {

    public int numberOfSteps(int num) {
        System.out.println("For input: " + num);
        int numberOfSteps = 0;
        // Solution 1
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            numberOfSteps++;
        }
        // Time complexity: O(logn)
        // Space complexity: O(1)

//        // Solution 2 - Binary representation of integers
//        while (num > 0) {
//            if ( (num & 1) == 0) { // num: xxxxxxx0 & 00000001
//                // Sol 1 we used num/2 now we use:
//                num = num >> 1;
//            } else {
//                num--;
//            }
//            numberOfSteps++;
//        }
//        // Time complexity: O(logn)
//        // Space complexity: O(1)
        System.out.println("-> numberOfSteps: " + numberOfSteps);
        return numberOfSteps;
    }
}
