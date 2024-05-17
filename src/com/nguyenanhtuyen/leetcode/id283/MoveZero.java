package com.nguyenanhtuyen.leetcode.id283;

public class MoveZero {
	
    public void moveZeroes(int[] nums) {
    	// cách 1: độ phức tạp O(1) => sắp xếp trực tiếp trên mảng
        int n = nums.length;
        int currentIndex = 0;
        for(int i=0; i<n; i++) {
        	if(nums[i] != 0) {
        		nums[currentIndex] = nums[i];
        		currentIndex++;
        	}
        }
        for(; currentIndex<n; currentIndex++) {
        	nums[currentIndex] = 0;
        }
        
        // cách 2: độ phức tạp O(n) => khởi tạo 1 mảng mới sau đó bỏ các ptu mảng cũ sang
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
