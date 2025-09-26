package org.cl.easy;

public class CountEqualAndDivInArray {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int countPairs(int[] nums, int k) {

        int len = nums.length;
        boolean isValueEqual;
        int result;
        int numberPairs = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                isValueEqual = nums[i] == nums[j];
                result = i * j;
                if (isValueEqual && result % k == 0) {
                    System.out.println("nums[" + i + "]=" + nums[i] + " & nums[" + j + "]=" + nums[j] +
                            " AND (i*j):" + "(" + i + "*" + j + ") = " + result + " which is %" + k + ": " +
                            isValueEqual + " & Therefore a pair ");
                    numberPairs++;
                }
            }
        }
        return numberPairs;
    }
}
