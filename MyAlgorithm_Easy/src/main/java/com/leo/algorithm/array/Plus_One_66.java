package com.leo.algorithm.array;

/*
 * 
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 * 
 * 
 * 题意：一个整数按位存储于一个int数组中，排列顺序为：最高位在array[0] ，最低位在[n-1]，例如：98，存储为：array[0]=9; array[1]=8，然后进行+1操作，即98+1，在数组上进行操作
解题思路：这是一道比较简单的题目，对一个数组进行加一操作。但是可不要小看这个题，这个题被称为“Google最喜欢的题”，因为在google面试中出现的频率非常高。从数组的最后一位开始加1，需要考虑进位，如果到[0]位之后仍然有进位存在，需要新开一个长度为(n.length + 1)的数组，拷贝原来的数组。

 * 
 * 
 */


public class Plus_One_66 {

	public int[] plusOne(int[] digits) {

		if (digits == null || digits.length == 0)
			return digits;

		int ln = digits.length;
		int carry =1;

		for (int i = ln - 1; i >= 0; i--) {

			if (digits[i] == 9) {

				digits[i] = 0;
				carry =1;
			} else {
				digits[i] = digits[i] + carry;
				return digits;
			}
		}

		if (digits[0] == 0) {

			digits = new int[ln + 1];
			digits[0] = 1;

		}

		return digits;

	}

}
