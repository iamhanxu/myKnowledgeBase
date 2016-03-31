package com.leo.algorithm.string;


/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.


This algorithm use regex and string split method

 */
public class Length_of_Last_Word_58 {

	public int lengthOfLastWord(String s) {
		if (s == null)
			return 0;

		s = s.toLowerCase().trim();
		String[] sarray = s.split("\\s+");
		String lw = sarray[sarray.length - 1];
		return lw.length();

	}

}
