package com.nguyenanhtuyen.leetcode.id1662;

public class CheckTwoStringArray {
	
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s1 : word1) {
        	sb1.append(s1);
        }
        for(String s2 : word2) {
        	sb2.append(s2);
        }
        if(sb1.toString().equals(sb2.toString())) {
        	return true;
        }
        return false;
    }

	public static void main(String[] args) {
		String word1[] = {"ab", "c"};
		String word2[] = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}

}
