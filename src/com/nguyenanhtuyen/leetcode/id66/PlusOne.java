package com.nguyenanhtuyen.leetcode.id66;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for(int i=n-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newArr = new int[n+1];
		newArr[0] = 1;
		return newArr;
	}

	public static void main(String[] args) {
		int[] digits = {9,9,9,9};
		int[] newArr = plusOne(digits);
		System.out.println(Arrays.toString(newArr));
	}

}
