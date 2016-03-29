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

�����˼· �� ��һ�� cache, hashset ȥ��ȡ��ù���sum, ���һ��sum �ظ����������number ��Զ�����ܻ���happy number

��� cache�������� ��������


�˴���һ��������  ���� ��λ������ Ҳ���Ǹ���һ�����֣�Ȼ��ֳɶ�λ�� ÿλ���в���

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
