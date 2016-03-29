package com.leo.algorithm.math;


/*
 * 
 * Key point:  the sum could have overflow, so if return value is int, 
 * the calculation cache we use long
 * and then use sum to compare with Integer.MAX_VALUE and Integer.MIN_VALUE
 * 
 * 
 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * 
 * 
 * Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * 
 * 
 */
public class String_to_Integer_atoi_8 {

	public int myAtoi(String str) {

		 // step1:check hull
		if (str == null || "".equals(str))
			return 0;
		// step2:remove whitespace
		str = str.trim();
		// step3: check sign, start point
		int sign = 1; // positive
		int start = 0; // starting point
		long sum = 0; // the result;
		if (str.charAt(0) == '-') {
			sign = -1;
			start = 1;
		} else if (str.charAt(0) == '+') {
			sign = 1;
			start = 1;
		} else {
			sign = 1;
			start = 0;
		}
		// step 4: build the sum with the consideration of special character and max_value min_value
		for (int i = start; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum * 10 + Character.getNumericValue(str.charAt(i));
			} else {
				return (int)sum * sign;
			}
			if (sign == 1 && sum * sign > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (sign == -1 && sum * sign < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		}
		return (int)sum * sign;
	}
	
	
	public static void main(String[] args) {
		String input = "2147483648";
		String_to_Integer_atoi_8 obj = new String_to_Integer_atoi_8();
		
		int re = obj.myAtoi(input);
		
		System.out.println(re);
		
	}

}
