package com.nguyenanhtuyen.leetcode.id155;

import java.util.Stack;

public class MinStack {
	
	class Node {
		int value;
		int MIN;
		Node(int value) {
			this.value = value;
		}
	}
	
	Stack<Node> stack = new Stack<>();

	public MinStack() {

	}

	public void push(int val) {
		Node newNode = new Node(val);
		if(stack.isEmpty()) {
			newNode.MIN = newNode.value;
		} else {
			newNode.MIN = Math.min(newNode.value, stack.peek().MIN);
		}
		stack.add(newNode);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek().value;
	}

	public int getMin() {
		return stack.peek().MIN;
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(0);
		minStack.push(2);
		minStack.push(-1);
		
	}

}
