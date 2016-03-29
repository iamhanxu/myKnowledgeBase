package com.leo.algorithm.math;


/*
 * 
 * 
 * 
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".


use while loop to when through each binary string , 
nd two individual loop for the reminder



 * 
 */






public class Add_Binary_67 {

	public String addBinary(String a, String b) {
		StringBuffer sb = new StringBuffer();

		if (a == null || "".equals(a))
			return b;
		if (b == null || "".equals(b))
			return a;

		int la = a.length() - 1;
		int lb = b.length() - 1;
		int carry = 0;

		while (la >= 0 && lb >= 0) {

			if (carry == 1) {

				if (a.charAt(la) == '1' && b.charAt(lb) == '1') {
					carry = 1;
					sb.append('1');
				} else if (a.charAt(la) == '0' && b.charAt(lb) == '0') {
					carry = 0;
					sb.append('1');
				} else {
					carry = 1;
					sb.append('0');
				}

			} else {

				if (a.charAt(la) == '1' && b.charAt(lb) == '1') {
					carry = 1;
					sb.append('0');
				} else if (a.charAt(la) == '0' && b.charAt(lb) == '0') {
					carry = 0;
					sb.append('0');
				} else {
					carry = 0;
					sb.append('1');
				}
			}
			la--;
			lb--;
		}

		while (la >= 0) {
			if (carry == 1) {
				if (a.charAt(la) == '1') {
					carry = 1;
					sb.append('0');
				} else {
					carry = 0;
					sb.append('1');
				}
			} else {
				if (a.charAt(la) == '0') {
					carry = 0;
					sb.append('0');
				} else {
					carry = 0;
					sb.append('1');
				}
			}
			
			la--;
		}

		while (lb >= 0) {
			if (carry == 1) {
				if (b.charAt(lb) == '1') {
					carry = 1;
					sb.append('0');
				} else {
					carry = 0;
					sb.append('1');
				}
			} else {
				if (b.charAt(lb) == '0') {
					carry = 0;
					sb.append('0');
				} else {
					carry = 0;
					sb.append('1');
				}
			}
			lb--;
		}

		if (carry == 1)
			sb.append('1');

		return sb.reverse().toString();

	}
	
	
	public static void main(String[] args) {
		
		
		Add_Binary_67 obj = new Add_Binary_67();
		
		obj.addBinary("111", "11");
	}
}
