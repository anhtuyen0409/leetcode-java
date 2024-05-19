package com.nguyenanhtuyen.leetcode.id448;

import java.util.ArrayList;
import java.util.List;

public class FindNumberDisappeare {
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
// solution 1
//        List<Integer> listNums = new ArrayList<>();
//        int n = nums.length;
//        // create array in the range [1,n]
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) {
//        	arr[i] = i+1;
//        }
//        // find
//        for(int i=0; i<n; i++) {
//        	int count = 0;
//        	for(int j=0; j<n; j++) {
//        		if(arr[i]==nums[j]) {
//        			count++;
//        		}
//        	}
//        	if(count==0) {
//        		listNums.add(arr[i]);
//        	}
//        }
//        return listNums;
    	
    	// solution 2
    	ArrayList<Integer> listNums = new ArrayList<>();
    	boolean[] exist = new boolean[nums.length + 1];
    	for(int i=0; i<nums.length; i++) {
    		exist[nums[i]] = true; // đánh dấu các ptu trong mảng là true
    	}
    	// kiểm tra trong range [1,n] ptu nào chưa đánh dấu
    	for(int i=1; i<=nums.length; i++) {
    		if(exist[i] == false) {
    			listNums.add(i);
    		}
    	}
    	return listNums;
    }

	public static void main(String[] args) {
		int[] nums = {1,1};
		List<Integer> listNums = findDisappearedNumbers(nums);
		for(int a : listNums) {
			System.out.println(a);
		}
	}

}
