package com.leo.algorithm.math;

/*
 * 
 * 
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * �� ugly number һ���� idea, power of two ��ѭ��% �� / �����Ľ���ǲ���1
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
