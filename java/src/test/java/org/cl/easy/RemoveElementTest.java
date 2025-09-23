package org.cl.easy;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void testRemoveElement_solution1_example1() {
        RemoveElement r = new RemoveElement();
        assertEquals(2, r.removeElement_solution1(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    void testRemoveElement_solution1_example2() {
        RemoveElement r = new RemoveElement();
        assertEquals(5, r.removeElement_solution1(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    void testRemoveElement_solution1_example3() {
        RemoveElement r = new RemoveElement();
        assertEquals(4, r.removeElement_solution1(new int[]{5, 4, 3, 2, 1}, 4));
    }

    @Test
    void testRemoveElement_solution3_example5() {
        RemoveElement r = new RemoveElement();
        assertEquals(8, r.removeElement_solution3(new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5}, 3));
    }

    @Test
    void testRemoveElement_solution4_example1() {
        RemoveElement r = new RemoveElement();
        assertEquals(2, r.removeElement_solution4(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    void testRemoveElement_solution4_example2() {
        RemoveElement r = new RemoveElement();
        assertEquals(5, r.removeElement_solution4(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    void testRemoveElement_solution4_example3() {
        RemoveElement r = new RemoveElement();
        assertEquals(4, r.removeElement_solution4(new int[]{5, 4, 3, 2, 1}, 4));
    }

    @Test
    void testRemoveElement_solution4_example4() {
        RemoveElement r = new RemoveElement();
        assertEquals(6, r.removeElement_solution4(new int[]{0, 2, 3, 4, 5, 1, 0, 3}, 3));
    }

    @Test
    void testRemoveElement_solution1_customJudge_example1() {
        int[] nums = {3, 2, 2, 3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {2, 2}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution1(nums, val);// Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution1_customJudge_example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution1(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution1_customJudge_example3() {
        int[] nums = {5, 4, 3, 2, 1};
        int val = 4;
        int[] expectedNums = {1, 2, 3, 5};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution1(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution2_customJudge_example1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution2(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution2_customJudge_example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};


        RemoveElement r = new RemoveElement();

        int k = r.removeElement_solution2(nums, val);
        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution2_customJudge_example3() {
        int[] nums = {5, 4, 3, 2, 1};
        int val = 4;
        int[] expectedNums = {1, 2, 3, 5};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution1(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution3_customJudge_example1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution3(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution3_customJudge_example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution3(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution3_customJudge_example3() {
        int[] nums = {5, 4, 3, 2, 1};
        int val = 4;
        int[] expectedNums = {1, 2, 3, 5};

        RemoveElement r = new RemoveElement();

        int k = r.removeElement_solution3(nums, val);
        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution4_customJudge_example1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution4(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution4_customJudge_example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution4(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveElement_solution4_customJudge_example3() {
        int[] nums = {5, 4, 3, 2, 1};
        int val = 4;
        int[] expectedNums = {1, 2, 3, 5};

        RemoveElement r = new RemoveElement();
        int k = r.removeElement_solution4(nums, val);

        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}