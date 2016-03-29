package com.leo.algorithm.array;

/*
 * 
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 * 
 * 
 * ���⣺һ��������λ�洢��һ��int�����У�����˳��Ϊ�����λ��array[0] �����λ��[n-1]�����磺98���洢Ϊ��array[0]=9; array[1]=8��Ȼ�����+1��������98+1���������Ͻ��в���
����˼·������һ���Ƚϼ򵥵���Ŀ����һ��������м�һ���������ǿɲ�ҪС������⣬����ⱻ��Ϊ��Google��ϲ�����⡱����Ϊ��google�����г��ֵ�Ƶ�ʷǳ��ߡ�����������һλ��ʼ��1����Ҫ���ǽ�λ�������[0]λ֮����Ȼ�н�λ���ڣ���Ҫ�¿�һ������Ϊ(n.length + 1)�����飬����ԭ�������顣

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
