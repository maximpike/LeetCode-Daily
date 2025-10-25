package org.cl.easy;

public class MergeSortedArray {

    // ---------------------- SOLUTION 1 -----------------------------//
    public void merge_solution1(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
    // Time complexity: O(m+n)
    // Space complexity: O(1)

    // ---------------------- SOLUTION 2 - Can Refactor into SOLUTION 1 -----------------------------//
    public void merge_solution2(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1;
        int pm = m - 1;
        int pn = n - 1;

        while (pn >= 0) {
            if (pm < 0 || nums2[pn] > nums1[pm]) {
                nums1[p] = nums2[pn];
                pn--;
            } else if (nums2[pn] < nums1[pm]) {
                nums1[p] = nums1[pm];
                pm--;
            } else {
                nums1[p] = nums2[pn];
                pn--;
            }
            p--;
        }
    }
    // Time complexity: O(n+m)
    // Space complexity: O(1)
}
