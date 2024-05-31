package com.nguyenanhtuyen.leetcode.id344;

public class ReserveString {
	
	public static void swap(char[] c, int i, int j) {
		if(i<j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			swap(c, i+1, j-1);
		}
	}

	public static void reverseString(char[] s) {
		swap(s, 0, s.length-1);
	}

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		for(char c : s) {
			System.out.println(c);
		}
	}

}
