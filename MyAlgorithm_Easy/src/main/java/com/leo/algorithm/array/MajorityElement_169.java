package com.leo.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
Given an array of size n, find the majority element. 
The majority element is the element that appears more than  n/2 times.
You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * 
 */
public class MajorityElement_169 {

	public int majorityElement2(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public int majorityElement(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;

		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				int value = map.get(nums[i]);
				map.put(nums[i], value + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		int max = 0;
		int max_key = -1;

		for (int key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				max_key = key;
			}
		}
		return max_key;

	}

}
