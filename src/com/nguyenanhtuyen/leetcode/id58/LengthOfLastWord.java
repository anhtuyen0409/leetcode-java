package com.nguyenanhtuyen.leetcode.id58;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		int n = words.length;
		int result = words[n-1].length();
		return result;
	}

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

}
