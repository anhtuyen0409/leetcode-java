package com.nguyenanhtuyen.leetcode.id387;

public class _387_FirstCharacter {
	
	public static int firstUniqChar(String s) {
		for(int i=0; i<s.length(); i++) {
			if(isCheck(s.charAt(i), s)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isCheck(char c, String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==c) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(firstUniqChar(s));
	}
}
