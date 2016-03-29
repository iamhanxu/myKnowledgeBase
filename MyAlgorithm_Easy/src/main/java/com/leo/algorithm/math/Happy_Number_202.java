package com.leo.algorithm.math;

import java.util.HashSet;
import java.util.Set;

/*
 * Happy number is a number that 
 * 
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

这里的思路 是 用一个 cache, hashset 去存取求得过的sum, 如果一个sum 重复出现则这个number 永远不可能会是happy number

这个 cache的条件是 跳出条件


此处再一次运用了  数字 分位操作， 也就是给定一个数字，然后分成多位， 每位进行操作

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 * 
 * 
 * 
 */
public class Happy_Number_202 {
	public boolean isHappy(int n) {

		Set<Integer> set = new HashSet<Integer>();

		while (true) {

			int sum = this.getSum(n);
			if (sum == 1) {
				return true;
			} else if (set.contains(sum)) {
				return false;
			} else {
				set.add(sum);
				n = sum;
			}
		}

	}

	private int getSum(int n) {
		int result = 0;
		while (n >= 1) {
			result = result + (int) Math.pow((n % 10), 2);
			n = n / 10;
		}
		return result;
	}
}
