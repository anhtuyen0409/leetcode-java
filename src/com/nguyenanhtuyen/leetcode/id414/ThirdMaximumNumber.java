package com.nguyenanhtuyen.leetcode.id414;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumber {
	
	public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
     }
	
//    public static int thirdMax(int[] nums) {
//        ArrayList<Integer> listNums = removeDuplicate(nums);
//        if(listNums.size()<3) {
//        	return listNums.get(0);
//        }
//        return listNums.get(2);
//    }
//	
//	public static ArrayList<Integer> removeDuplicate(int[] arr) {
//		ArrayList<Integer> listArr = new ArrayList<>();
//		for(int i=0; i<arr.length; i++) {
//			int count = 0;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count!=0) {
//				continue;
//			}
//			listArr.add(arr[i]);
//		}
//		Collections.sort(listArr, Collections.reverseOrder());
//		return listArr;
//	}

	public static void main(String[] args) {
//		int arr[] = {2,2,3,1};
//		int rs = thirdMax(arr);
//		System.out.println(rs);
	}

}
