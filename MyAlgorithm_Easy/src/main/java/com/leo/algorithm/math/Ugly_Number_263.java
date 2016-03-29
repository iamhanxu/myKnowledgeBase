package com.leo.algorithm.math;

/*
 * Not a optimized solution, but it works
 * 
 * 
 * Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
 * 
 * 
 * 
 * �ڶ��ַ��� ���� ���� �� ����prime factors �� 2��3��5 �����γ�����Щfactor, ����ʣ�µ���ʲô������ 
 * 
 * ���ʣ�µ� ��1 ˵�� ���е�prime factors ���� 2��3��5�� �����б�� factor.
 * 
 * 
 * 
 */
public class Ugly_Number_263 {

	public boolean isUgly2(int num) {

		// Ugly numbers are positive numbers whose prime factors only include 2,
		// 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it
		// //includes another prime factor 7.
		// 1:positive and zero check

		if (num <= 0)
			return false;

		while (num % 2 == 0) {
			num = num / 2;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}

		if (num == 1) {
			// if all left is 1 then means it is a ugly number
			return true;

		} else {
			return false;
		}

	}

	public boolean isUgly(int num) {

		for (int i = 2; i < num; i++) {
			if (num != i && num % i == 0) {
				if (isNoUglyPrime(i))
					return false;
			}
		}

		return true;
	}

	private boolean isNoUglyPrime(int num) {

		if (num == 2 || num == 3 || num == 5)
			return false;

		for (int i = 2; i <= Math.sqrt(num) + 1; i++) {
			if (num != i && num % i == 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Ugly_Number_263 obj = new Ugly_Number_263();
		System.out.println("905391974  " + obj.isUgly(905391974));
	}
}
