package com.nguyenanhtuyen.leetcode.id394;

import java.util.Stack;

public class DecodeString {
	
	public static String decodeString(String s) {
		int n = s.length();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			char c = s.charAt(i);
			// duyệt chuỗi cho đến khi gặp dấu "]"
			if(c == ']') {
				// lấy các phần tử trước dấu "]" cho đến khi gặp dấu "[" -> lấy các ptu trong dấu "[]"
				String str = "";
				while(stack.peek() != '[') {
					str = stack.pop() + str;
				}
				
				// xoá "["
				stack.pop();
				
				// lấy số trước dấu "[]"
				String numString = "";
				while(stack.isEmpty() == false && Character.isDigit(stack.peek())) {
					numString = stack.pop() + numString;
				}
				
				// chuyển string -> int
				int num = Integer.parseInt(numString);
				
				// tiến hành nhân số với các ptu trong dấu "[]"
				str = str.repeat(num);
				
				// thêm chuỗi vừa nhân vào lại stack
				for(int j=0; j<str.length(); j++) {
					stack.push(str.charAt(j));
				}
			}else {
				stack.push(c);
			}
		}
		String result = "";
		while(stack.isEmpty() == false) {
			result = stack.pop() + result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
