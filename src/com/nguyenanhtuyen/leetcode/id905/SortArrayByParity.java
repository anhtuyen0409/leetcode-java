package com.nguyenanhtuyen.leetcode.id905;

public class SortArrayByParity {

//	public boolean checkEven(int n) {
//		if(n%2==0) {
//			return true;
//		}
//		return false;
//	}
//	
//    public int[] sortArrayByParity(int[] nums) {
//        for(int i=0; i<nums.length-1; i++) {
//        	for(int j=nums.length-1; j>i; j--) {
//        		if(checkEven(nums[j])) {
//        			int temp = nums[j];
//        			nums[j] = nums[j-1];
//        			nums[j-1] = temp;
//        		}
//        	}
//        }
//        return nums;
//    }

	public int[] sortArrayByParity(int[] nums) {
		for (int i = 0, j = 0; j < nums.length; j++)
			if (nums[j] % 2 == 0) {
				int temp = nums[i];
				nums[i++] = nums[j];
				nums[j] = temp;
				;
			}
		return nums;
	}

	public static void main(String[] args) {
		SortArrayByParity test = new SortArrayByParity();
		int[] nums = { 3, 1, 2, 4 };
		int[] arr = test.sortArrayByParity(nums);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
