package com.nguyenanhtuyen.leetcode.id27;

public class _27_RemoveElement {

	public int removeElement(int[] nums, int val) {
		int n = nums.length;
		for(int i=0; i<n;) {
			if(nums[i] == val) {
				//xoá phần tử nums[i]
				for(int j=i; j<n-1; j++) {
					nums[j] = nums[j+1]; // dịch chuyển phần tử sang trái
				}
				n--;
			} else {
				i++;
			}
		}
		return n;
	}

	// ky thuật sử dụng 2 con trỏ
	public int removeElement2(int[] nums, int val) {
		int k = 0; // con trỏ k 
		// con trỏ i để duyệt mảng
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i]; // nums[k] là phần tử đúng cuối cùng
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
