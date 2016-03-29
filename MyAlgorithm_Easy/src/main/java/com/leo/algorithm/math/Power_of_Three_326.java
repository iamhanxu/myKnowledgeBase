package com.leo.algorithm.math;


/*
 * 
 * Given an integer, write a function to determine if it is a power of three.
 * Similar idea of power of two and ugly number, use % and / to get the reminder
 * 
 */
public class Power_of_Three_326 {

	public boolean isPowerOfThree(int n) {

		if (n == 0)
			return false;

		while (n % 3 == 0) {
			n = n / 3;
		}

		if (n == 1) {
			return true;
		} else {
			return false;
		}

	}
}
