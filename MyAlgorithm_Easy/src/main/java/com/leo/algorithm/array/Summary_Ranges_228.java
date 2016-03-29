package com.leo.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
 * 
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

Credits:
 * 
 * 
 * 
 */


public class Summary_Ranges_228 {
	
	
    public List<String> summaryRanges(int[] nums) {
        
        
        List<String> list = new ArrayList<String>();
        if(nums==null || nums.length ==0)
        return list;
        
       for(int i=0 ; i<nums.length ; i++){
           
           int start = nums[i];
           
           //这个while loop是关键代码 ，在不满足条件的情况下下 增加
           while( i+1<nums.length && nums[i]+1 == nums[i+1] ){
               i++;
           }
           
           if(start == nums[i]){
               String str = start+"";
               list.add(str);
           }else{
               String str = start+"->"+nums[i];
               list.add(str);
           }
           
       }
       
       return list;
        
        
    }

}
