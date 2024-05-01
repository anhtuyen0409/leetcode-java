package com.nguyenanhtuyen.leetcode.id20;

import java.util.Stack;

public class ValidParenthese {
	
//    public static boolean isValid(String s) {
//    	int check = -1;
//        if(s==null||s.length()==0||s.length()%2>0) {
//        	return false;
//        }
//        else {
//        	for(int i=0; i<s.length(); i=i+2) {
//            	if(i%2==0 && s.charAt(i)=='[' && s.charAt(i+1)==']' || s.charAt(i)=='(' && s.charAt(i+1)==')' || s.charAt(i)=='{' && s.charAt(i+1)=='}') {
//            		check = 1;
//            	}
//            }
//        	if(check == 1) {
//        		return true;
//        	}
//        	return false;        
//        }  
//    }
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		String s = "([])";
		System.out.println(isValid(s));
	}

}
