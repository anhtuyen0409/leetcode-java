package com.nguyenanhtuyen.leetcode.id704;

public class BinarySearch {
	
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
        	int mid = (left + right)/2;
        	if(nums[mid] == target) {
        		return mid;
        	} else if(nums[mid] > target) {
        		right = mid - 1;
        	} else {
        		left = mid + 1;
        	}
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
