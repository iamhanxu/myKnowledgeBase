package com.leo.algorithm.array;

import java.util.HashSet;
import java.util.Set;
/*
 * 217 Contains Duplicate
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array,
 *  and it should return false if every element is distinct.
 * 
 * 
 * 
 * ff
 */
public class ContainsDuplicate_217 {
	public boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length == 0)
			return false;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		if (set.size() == nums.length) {
			return false;
		} else {
			return true;
		}

	}
}
