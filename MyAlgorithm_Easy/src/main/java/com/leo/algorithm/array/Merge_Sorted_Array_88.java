package com.leo.algorithm.array;


/*
 * use two pointers
 * 
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 
as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 
 */


public class Merge_Sorted_Array_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int start = m + n - 1;
		int s1 = m - 1;
		int s2 = n - 1;

		while (s1 >= 0 && s2 >= 0) {

			if (nums1[s1] > nums2[s2]) {
				nums1[start] = nums1[s1];
				s1--;
				start--;
			} else {
				nums1[start] = nums2[s2];
				s2--;
				start--;
			}
		}

		if (s1 < 0) {

			while (s2 >= 0) {
				nums1[start] = nums2[s2];
				start--;
				s2--;
			}
		}

	}
}
