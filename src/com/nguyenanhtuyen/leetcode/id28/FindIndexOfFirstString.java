package com.nguyenanhtuyen.leetcode.id28;

public class FindIndexOfFirstString {
	
    public static int strStr(String haystack, String needle) {
    	int index = 0, rs = 0;
    	char[] charArray = haystack.toCharArray();
    	if(haystack.contains(needle)) {
    		for(int i=0; i<haystack.length(); i++) {
    			String s = "";
    			for(int j=i; j<needle.length()+i; j++) {
    				s += charArray[j];
    				if(s.equals(needle)) {
            			index = i;
            			rs = 1;
            		}
    			}
    			if(rs==1) {
    				break;
    			}
        	}
    		return index;
    	}
    	return -1;
    }

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}

}
