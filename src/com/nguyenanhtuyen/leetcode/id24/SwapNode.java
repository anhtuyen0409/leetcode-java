package com.nguyenanhtuyen.leetcode.id24;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {

	ListNode swapPairs(ListNode head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		// swap node
		ListNode nextNode = head.next;
		head.next = nextNode.next;
		nextNode.next = head;
		
		ListNode newHead = swapPairs(head.next);
		head.next = newHead;
		
		return nextNode;
	}
	
}

public class SwapNode {
	
	public static void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.println(head.val + "");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		Solution solution = new Solution();
		ListNode newList = solution.swapPairs(node1);
		printLinkedList(newList);
	}
}
