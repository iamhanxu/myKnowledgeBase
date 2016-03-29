package com.leo.algorithm.math;


/*
 * 
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    
    
    The number base convertion
 */
public class Excel_Sheet_Column_Number_171 {
	
    public int titleToNumber(String s) {
        
        if(s==null || "".equals(s))
        return 0;
        
        int j=0;
        int res =0;
        for(int i=s.length()-1 ;i>=0  ; i--){
           res =   (s.charAt(i)-'A'+1)*((int)Math.pow(26,j))  + res;
           j++;
        }
          
        return res;
          
      }

}
