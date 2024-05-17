package com.nguyenanhtuyen.leetcode.id977;

public class SquareOfSortArray {
	
	// cách 1:
//	public int[] squareArray(int[] a) {
//		for(int i=0; i<a.length; i++) {
//			a[i] = a[i]*a[i];
//		}
//		return a;
//	}
//	public int[] sortArray(int[] a) {
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		return a;
//	}
//    public int[] sortedSquares(int[] nums) {
//        squareArray(nums);
//        sortArray(nums);
//        return nums;
//    }
    
    //cách 2: tối ưu
	public int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[p1]) >= Math.abs(nums[p2])) {
                newArray[i] = nums[p1] * nums[p1];
                p1++;
            }
            else {
                newArray[i] = nums[p2] * nums[p2];
                p2--;    
            }
        }
        return newArray;
   }
    
	public static void main(String[] args) {
		SquareOfSortArray test = new SquareOfSortArray();
		int[] nums = {-4,-1,0,3,10};
		System.out.println(test.sortedSquares(nums));
	}

}
