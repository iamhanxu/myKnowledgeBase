package com.leo.algorithm.math;


/*
 * 
 * Given a positive integer, return its corresponding column title as appear 
 * in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * 
 * steps to build like the reverse number;
 * 
 * n-1 mode to the result
 * 
 * n-1 divide to itself
 * 
 * 
 */
public class Excel_Sheet_Column_Title_168 {

	
	   public String convertToTitle(int n) {
	        StringBuffer sb = new StringBuffer();
	        while(n>=1){
	          sb.append((char)('A'+ (n-1)%26));
	           n = (n-1)/26;
	        }
	        
	        return sb.reverse().toString();
	       
	    }
	   
	   
	    public String convertToTitle2(int n) {
	        String res="";
	        while(n>=1){
	          res = ((char)('A'+ (n-1)%26))+res;
	           n = (n-1)/26;
	        }
	        
	        return res;
	       
	    }

}
