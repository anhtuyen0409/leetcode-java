package com.nguyenanhtuyen.leetcode.id1346;

public class CheckN {
	
    public static boolean checkIfExist(int[] arr) {
    	int check = 0;
        for(int i=0; i<arr.length-1; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]==arr[j]*2 || arr[j]==arr[i]*2) {
        			check = 1;
        			break;
        		}
        	}
        	if(check==1) {
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		int[] arr = {7,1,14,11};
		System.out.println(checkIfExist(arr));

	}

}
