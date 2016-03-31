package com.leo.algorithm.string;

/*
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

I use StringBuffer 

 */
public class Valid_Palindrome_125 {

	public boolean isPalindrome(String s) {

		if (s == null)
			return true;
		s = s.toLowerCase();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}

		String first = sb.toString();
		String second = sb.reverse().toString();

		if (first.equals(second)) {
			return true;
		} else {
			return false;
		}
	}
	
	// a example to use Regex, but preformance is not good
	public boolean isPalindrome1(String s){
		if(s==null)
			return true;
		
		s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		String tmp = sb.reverse().toString();
		if(s.equals(tmp)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
      String s = "   ";
      
      s = s.trim();
      
      String[] sarray = s.split("\\s+");
      System.out.println(sarray.length);
      for(String str : sarray){
    	  System.out.println(str);
      }
		
	}
}
