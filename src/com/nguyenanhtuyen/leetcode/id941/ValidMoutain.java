package com.nguyenanhtuyen.leetcode.id941;

public class ValidMoutain {
	
	public static boolean validMountainArray(int[] arr) {
		int n = arr.length;
		boolean check = true; // mặc định dãy tăng
		if(n < 3) {
			return false;
		}
		for(int i=0; (i+1)<n; i++) {
			int j = i+1; // ptu phía sau
			if(arr[i] > arr[j]) { // dãy giảm
				if(check == false) {
					
				} else {
					if(i==0) {
						return false;
					}
					check = false;
				}
			} else if(arr[i] < arr[j]) { // dãy tăng
				if(check == true) {
					
				} else {
					return false;
				}
			} else { // arr[i]==arr[j]
				return false; // dãy chỉ tăng hoặc giảm
			}
		}
		if(check == false) {
			return true;
		}
		return false;
    }

	public static void main(String[] args) {
		int[] arr = {0,3,2,1};
		System.out.println(validMountainArray(arr));
	}

}
