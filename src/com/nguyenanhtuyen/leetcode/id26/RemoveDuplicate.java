package com.nguyenanhtuyen.leetcode.id26;

public class RemoveDuplicate {
	
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        
        return count + 1;
    }

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}
