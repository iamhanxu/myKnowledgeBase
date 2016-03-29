package com.leo.algorithm.math;

/*
 * 
 * Palindrome Number: 判断数字的回文 ， 简单的方法使用 reverse 这个数字 然后比较
 * 注意positive and negative number
 * usually, when the number is positive ,it should return false, but please read carefully about the requirement
 * hint: when reverse a integer, please take care of the overflow by uing long instead of int
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome_Number_9 {

	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;
		int y = this.reverse(x);
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}

	private int reverse(int x) {

		long tmp = (long) x;
		int sign = 1;
		long result = 0;
		if (x < 0) {
			sign = -1;
			tmp = tmp * -1;
		}

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
