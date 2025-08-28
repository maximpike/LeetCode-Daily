package org.cl.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubarrayOfOnes {

    public int longestSubarray(int[] nums) {

        // Solution 2: Use List Array and .remove method (remove method won't work as we don't know the size of the
        // returned array until nums array evaluated
        List<Integer> listResult = new ArrayList<>();
        int indexToRemove = 0;
        int onesCounter = 0;
        int counter = 0;
        boolean isIndexSet = false;
        boolean isIndexRemoved = false;
        boolean isSubArrayFilled  = false;

        for (int i = 0; i < nums.length; i++) {
//            System.out.println("Value at index[" + i + "] equals " + nums[i]);
            // How are we going to handle multiple zeros in an array [1,1,1,0,1,1,1,1,0]
            // As this current logic only sets the last zero value found
            if (nums[i] == 0) {
                indexToRemove = i;
                isIndexSet = true;
            }
            if (nums[i] == 1) {
                onesCounter++;
            }
        }
        System.out.println("indexToRemove: " + indexToRemove + " & onesCounter: " + onesCounter);

        // We are going to check if an index value has been set, If an index value is never set then we can assume
        // nums has no zero values and there only contains 1's
        // TO LOOK INTO -> Logic can possibly be refactored into while loop
        if (!isIndexSet) {
            for (int j = 0; j < nums.length-1; j++ ) {
                listResult.add(nums[j]);
            }
            // We have now created a list of size nums.length-1 and can set that at least 1 index has been removed
            System.out.println("listResults: " + listResult + " Size: " + listResult.size() + "\n");
            return listResult.size();
        }

        // introduce second condition
        // How do we ensure that the isIndexRemoved condition is satisfied while also allowing the correctly sized sub array to populate
        while (!isIndexRemoved || !isSubArrayFilled) {
            if (onesCounter == 0) {
                System.out.println("listResults: " + listResult + " Size: " + listResult.size() + "\n");
                return 0;
            }
            if (counter == indexToRemove) {
                System.out.println("Index removed");
                isIndexRemoved = true;
            }
            if (nums[counter] != 0) {
                listResult.add(nums[counter]);
            }
            if (onesCounter == listResult.size()) {
                System.out.println("Sub Array filled");
                isSubArrayFilled = true;
            }
            counter++;
        }
        System.out.println("listResults: " + listResult + " Size: " + listResult.size() + "\n");
        return listResult.size();
    }
}
