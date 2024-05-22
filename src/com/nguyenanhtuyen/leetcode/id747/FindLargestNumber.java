package com.nguyenanhtuyen.leetcode.id747;

public class FindLargestNumber {
	
    public static int dominantIndex(int[] nums) {
    	int max = 0, index = 0;
    	// find max
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] > max) {
    			max = nums[i];
    			index = i;
    		}
    	}
    	// check
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]*2 > max && nums[i] != max) {
    			return -1;
    		}
    	}
    	
    	return index;
    }

	public static void main(String[] args) {
		int[] nums = {3,6,1,0};
		int result = dominantIndex(nums);
		System.out.println(result);
	}

}
