package com.nguyenanhtuyen.leetcode.id1051;

public class HeightChecker {
	
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        int count = 0;
        for(int i=0; i<n; i++) {
        	// copy array
        	arr[i] = heights[i];
        }
        
        // sort 
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		if(heights[i] > heights[j]) {
        			int temp = heights[i];
        			heights[i] = heights[j];
        			heights[j] = temp;
        		}
        	}
        }
        
        // compare
        for(int i=0; i<n; i++) {
        	if(arr[i] != heights[i]) {
        		count++;
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		int heights[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}

}
