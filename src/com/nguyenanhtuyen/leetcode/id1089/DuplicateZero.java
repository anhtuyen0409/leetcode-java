package com.nguyenanhtuyen.leetcode.id1089;

public class DuplicateZero {
	
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
        	if(arr[i] == 0) {
        		// dịch các ptu arr[i+1] đến arr[n-2] sang phải 1 đơn vị
        		for(int j=n-2; j>=i+1; j--) {
        			arr[j+1] = arr[j];
        		}
        		if(i + 1 < n) {
        			// gán arr[i+1] = 0
            		arr[i+1] = 0;
            		i++;
            	}
        	}
        }
    }

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
