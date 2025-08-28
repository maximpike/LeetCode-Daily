package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOfOnesTest {

    @Test
    void testLongestSubarray1x1Array() {
        // No. input[] test cases = 2^1=2
        int[] inputOnesArray = new int[]{1};
        int[] inputZerosArray = new int[]{0};
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(0, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZerosArray));
    }

    @Test
    void testLongestSubarray1x2Array() {
        // No. input[] test cases = 2^2=4
        int[] inputOnesArray = new int[]{1,1};
        int[] inputBinaryArray10 = new int[]{1,0};
        int[] inputBinaryArray01 = new int[]{0,1};
        int[] inputZerosArray = new int[]{0,0};
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(1, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZerosArray));
        assertEquals(1, l.longestSubarray(inputBinaryArray10));
        assertEquals(1, l.longestSubarray(inputBinaryArray01));
    }

    @Test
    void testLongestSubarray1x3Array() {
        // No. input[] test cases = 2^3=8
        int[] inputOnesArray = new int[]{1,1,1};
        int[] inputZeroArray = new int[]{0,0,0};
        int[] inputBinaryArray001 = new int[]{0,0,1};
        int[] inputBinaryArray010 = new int[]{0,1,0};
        int[] inputBinaryArray100 = new int[]{1,0,0};
        int[] inputBinaryArray101 = new int[]{1,0,1};
        int[] inputBinaryArray011 = new int[]{0,1,1};
        int[] inputBinaryArray110 = new int[]{1,1,0};
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(2, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZeroArray));
        assertEquals(1, l.longestSubarray(inputBinaryArray001));
        assertEquals(1, l.longestSubarray(inputBinaryArray010));
        assertEquals(1, l.longestSubarray(inputBinaryArray100));
        assertEquals(2, l.longestSubarray(inputBinaryArray101));
        assertEquals(2, l.longestSubarray(inputBinaryArray011));
        assertEquals(2, l.longestSubarray(inputBinaryArray110));
    }

    @Test
    void testLongestSubarray1x4Array() {
        // No. input[] test cases = 2^4=16
        int[] inputOnesArray = new int[]{1,1,1,1};          // 1
        int[] inputZeroArray = new int[]{0,0,0,0};          // 2
        int[] inputBinaryArray0001 = new int[]{0,0,0,1};    // 3
        int[] inputBinaryArray0010 = new int[]{0,0,1,0};    // 4
        int[] inputBinaryArray0100 = new int[]{0,1,0,0};    // 5
        int[] inputBinaryArray1000 = new int[]{1,0,0,0};    // 6
        int[] inputBinaryArray0011 = new int[]{0,0,1,1};    // 7
        int[] inputBinaryArray0110 = new int[]{0,1,1,0};    // 8
        int[] inputBinaryArray1100 = new int[]{1,1,0,0};    // 9
        int[] inputBinaryArray0101 = new int[]{0,1,0,1};    // 10
        int[] inputBinaryArray1010 = new int[]{1,0,1,0};    // 11
        int[] inputBinaryArray1001 = new int[]{1,0,0,1};    // 12
        int[] inputBinaryArray0111 = new int[]{0,1,1,1};    // 13
        int[] inputBinaryArray1110 = new int[]{1,1,1,0};    // 14
        int[] inputBinaryArray1011 = new int[]{1,0,1,1};    // 15
        int[] inputBinaryArray1101 = new int[]{1,1,0,1};    // 16
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(3, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZeroArray));
        assertEquals(1, l.longestSubarray(inputBinaryArray0001));
        assertEquals(1, l.longestSubarray(inputBinaryArray0010));
        assertEquals(1, l.longestSubarray(inputBinaryArray0100));
        assertEquals(1, l.longestSubarray(inputBinaryArray1000));
        assertEquals(2, l.longestSubarray(inputBinaryArray0011));
        assertEquals(2, l.longestSubarray(inputBinaryArray0110));
        assertEquals(2, l.longestSubarray(inputBinaryArray1100));
        assertEquals(2, l.longestSubarray(inputBinaryArray0101));
        assertEquals(2, l.longestSubarray(inputBinaryArray1010));
        assertEquals(2, l.longestSubarray(inputBinaryArray1001));
        assertEquals(3, l.longestSubarray(inputBinaryArray0111));
        assertEquals(3, l.longestSubarray(inputBinaryArray1110));
        assertEquals(3, l.longestSubarray(inputBinaryArray1011));
        assertEquals(3, l.longestSubarray(inputBinaryArray1101));
    }

    @Test
    void testLongestSubarray1x5Array() {
        // No. input[] test cases = 2^5=25
        int[] inputOnesArray = new int[]{1,1,1,1,1};           // 1
        int[] inputZeroArray = new int[]{0,0,0,0,0};           // 2
        int[] inputBinaryArray00001 = new int[]{0,0,0,1,0};    // 3
        int[] inputBinaryArray00010 = new int[]{0,0,1,0,0};    // 4
        int[] inputBinaryArray00100 = new int[]{0,0,1,0,0};    // 5
        int[] inputBinaryArray01000 = new int[]{0,1,0,0,0};    // 6
        int[] inputBinaryArray10000 = new int[]{1,0,0,0,0};    // 6
//        int[] inputBinaryArray0011 = new int[]{0,0,1,1};    // 7
//        int[] inputBinaryArray0110 = new int[]{0,1,1,0};    // 8
//        int[] inputBinaryArray1100 = new int[]{1,1,0,0};    // 9
//        int[] inputBinaryArray0101 = new int[]{0,1,0,1};    // 10
//        int[] inputBinaryArray1010 = new int[]{1,0,1,0};    // 11
//        int[] inputBinaryArray1001 = new int[]{1,0,0,1};    // 12
//        int[] inputBinaryArray0111 = new int[]{0,1,1,1};    // 13
//        int[] inputBinaryArray1110 = new int[]{1,1,1,0};    // 14
//        int[] inputBinaryArray1011 = new int[]{1,0,1,1};    // 15
//        int[] inputBinaryArray1101 = new int[]{1,1,0,1};    // 16
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(3, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZeroArray));
        assertEquals(1, l.longestSubarray(inputBinaryArray00001));
        assertEquals(1, l.longestSubarray(inputBinaryArray00010));
        assertEquals(1, l.longestSubarray(inputBinaryArray00100));
        assertEquals(1, l.longestSubarray(inputBinaryArray01000));
        assertEquals(1, l.longestSubarray(inputBinaryArray10000));
//        assertEquals(2, l.longestSubarray(inputBinaryArray0011));
//        assertEquals(2, l.longestSubarray(inputBinaryArray0110));
//        assertEquals(2, l.longestSubarray(inputBinaryArray1100));
//        assertEquals(2, l.longestSubarray(inputBinaryArray0101));
//        assertEquals(2, l.longestSubarray(inputBinaryArray1010));
//        assertEquals(2, l.longestSubarray(inputBinaryArray1001));
//        assertEquals(3, l.longestSubarray(inputBinaryArray0111));
//        assertEquals(3, l.longestSubarray(inputBinaryArray1110));
//        assertEquals(3, l.longestSubarray(inputBinaryArray1011));
//        assertEquals(3, l.longestSubarray(inputBinaryArray1101));
    }

    @Test
    void testLongestSubarray1x9Array() {
        int[] inputOnesArray = new int[]{1,1,1,1,1,1,1,1,1};
        int[] inputZerosArray = new int[]{0,0,0,0,0,0,0,0,0};
        int[] inputBinaryArray011101101 = new int[]{0,1,1,1,0,1,1,0,1};
        int[] inputBinaryArray000011111 = new int[]{0,0,0,0,1,1,1,1,1};
        LongestSubarrayOfOnes l = new LongestSubarrayOfOnes();
        assertEquals(8, l.longestSubarray(inputOnesArray));
        assertEquals(0, l.longestSubarray(inputZerosArray));
        assertEquals(5, l.longestSubarray(inputBinaryArray000011111));
        assertEquals(5, l.longestSubarray(inputBinaryArray011101101));
    }
}