package com.leo.algorithm.math;

/*
 * 
 * 只用自己会的还不错的方法 recursion
 * 
Given a non-negative integer num, repeatedly add all its digits until the result 
has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, 
return it.
 * 
 * 
 * 
 */
public class Add_Digits_258 {

	public int addDigits(int num) {
		return this.calc(num);
	}

	private int calc(int num) {

		if (num < 10) {
			return num;
		}

		int result = 0;
		while (num >= 1) {
			result = result + num % 10;
			num = num / 10;
		}
		return calc(result);

	}
}
