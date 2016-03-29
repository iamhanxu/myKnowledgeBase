package com.leo.algorithm.array;

/*
 
这是我可以想到的 最简单的 而且没有corner case的解决方法， 因为 k 有可能比length 大
重新分配一个相同大小的 array 用 two pointer 来做

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, 
the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */


public class Rotate_Array_189 {

	
    public void rotate(int[] nums, int k) {
        
        if(nums==null)
        return;
        int ln = nums.length;
        //重新弄一个数组
        int[]tmp = new int[ln];
        
        //新数组的起始点是 k%ln, 从k%n开始负值
        int j=k%ln;
        for(int i=0 ;i<ln;i++){
            tmp[j] = nums[i];
            j = (j+1)%ln;
        }
        
        for(int i=0 ;i<ln ;i++){
            nums[i] = tmp[i];
        }
        
    }
}
