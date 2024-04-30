package com.nguyenanhtuyen.leetcode.id1295;

/**
 * đếm số chữ số của 1 số -> lấy số có số chữ số là chẵn. vd: 1234 -> chọn, 12
 * -> chọn
 * 
 * @author tuyen
 *
 */
public class _1295_FindNumber {

	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			int soChuSo = 0;
			int kq = 1;
			while(kq!=0) {
				kq = nums[i] / 10;
				nums[i] = kq;
				soChuSo++;
			}
			if(soChuSo %2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {12, 345, 2, 6, 7896};
		System.out.println("Result: " + findNumbers(nums));
	}
}
