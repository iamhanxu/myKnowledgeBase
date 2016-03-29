package com.leo.algorithm.array;

/*
 
�����ҿ����뵽�� ��򵥵� ����û��corner case�Ľ�������� ��Ϊ k �п��ܱ�length ��
���·���һ����ͬ��С�� array �� two pointer ����

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, 
the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */


public class Rotate_Array_189 {

	
    public void rotate(int[] nums, int k) {
        
        if(nums==null)
        return;
        int ln = nums.length;
        //����Ūһ������
        int[]tmp = new int[ln];
        
        //���������ʼ���� k%ln, ��k%n��ʼ��ֵ
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
