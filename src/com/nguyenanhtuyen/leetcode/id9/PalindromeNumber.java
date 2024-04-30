package com.nguyenanhtuyen.leetcode.id9;

public class PalindromeNumber {
	
    public static boolean isPalindrome(int x) {
    	int s = 0, n, temp = x;
    	if(x >= 0) {
    		while(x > 0) {
            	n = x % 10;
            	s = s * 10 + n;
            	x/=10;
            }
    		if(s==temp) {
    			return true;
    		}
    		return false;
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		int x = 0;
		System.out.println(isPalindrome(x));
	}
}
