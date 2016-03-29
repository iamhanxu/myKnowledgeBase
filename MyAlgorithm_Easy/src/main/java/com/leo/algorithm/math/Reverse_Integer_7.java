package com.leo.algorithm.math;


/*
 * Note: when involve integer operation, please take care of the overflow by using long 
 * 
 * 
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 * 
 * Steps to solve the reverse: mod to result, and division to itself
 */


public class Reverse_Integer_7 {
	public int reverse(int x) {

		long tmp = (long) x;
		int sign = 1;
		if (x < 0) {
			sign = -1;
			tmp = tmp * -1;
		}
		long result = 0;
		while (tmp >= 1) {

			result = result * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		result = result * sign;
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) result;
		}
	}
}
