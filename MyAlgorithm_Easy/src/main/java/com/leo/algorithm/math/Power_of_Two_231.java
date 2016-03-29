package com.leo.algorithm.math;

/*
 * 
 * 
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * 和 ugly number 一样的 idea, power of two 就循环% 和 / 看最后的结果是不是1
 * 
 * 
 * 
 */

public class Power_of_Two_231 {
	public boolean isPowerOfTwo(int n) {

		if (n == 0)
			return false;

		while (n % 2 == 0) {
			n = n / 2;
		}

		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}
}
