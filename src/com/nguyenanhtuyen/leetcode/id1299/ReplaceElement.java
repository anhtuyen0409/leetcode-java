package com.nguyenanhtuyen.leetcode.id1299;

public class ReplaceElement {
	
//	public int findMaxOfRight(int[] arr, int target, int index) {
//		int max = -1;
//		for(int i=index; i<arr.length; i++) {
//			if(arr[i] == target) {
//				continue;
//			}
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		return max;
//	}
//	
//    public int[] replaceElements(int[] arr) {
//    	int n = arr.length;
//    	int[] newArr = new int[n];
//        for(int i=0; i<n; i++) {
//        	newArr[i] = findMaxOfRight(arr, arr[i], i);
//        }
//        return newArr;
//    }
	
	public int[] replaceElements(int[] arr) {
    	int n = arr.length;
    	for(int i=n-1; i>=0; i--) {
    		if(i != n-1) {
    			arr[i] = Math.max(arr[i], arr[i+1]);
    		}
    	}
    	for(int i=1; i<n; i++) {
    		arr[i-1] = arr[i];
    	}
    	if(n>0) {
    		arr[n-1] = -1;
    	}
    	return arr;
    }

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		ReplaceElement test = new ReplaceElement();
		int[] newArr = test.replaceElements(arr);
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
