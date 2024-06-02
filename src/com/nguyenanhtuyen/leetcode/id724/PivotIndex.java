package com.nguyenanhtuyen.leetcode.id724;

public class PivotIndex {

	public static int pivotIndex(int[] nums) {
		int n = nums.length;
		if(n == 1) {
			return 0;
		}
		if(n == 0) {
			return -1;
		}
		int[] left = new int[n];
		int[] right = new int[n];
		for(int i=0; i<n; i++) {
			int j = n-1-i;
			left[i] = (i==0) ? nums[i] : (left[i-1] + nums[i]);
			right[j] = (j==n-1) ? nums[j] : (right[j+1] + nums[j]);
		}
		for(int i=0; i<n; i++) {
			if(i == 0) {
				if(right[1] == 0) {
					return i;
				}
			} else if (i == n - 1) {
				if(left[n-2] == 0) {
					return i;
				}
			} else {
				if(left[i-1] == right[i+1]) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}

}
