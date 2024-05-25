package com.nguyenanhtuyen.leetcode.id206;

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

public class ReverseLinkedList {
	
    public static ListNode reverseList(ListNode head) {
        // điều kiện dừng
    	if(head == null) {
    		return null;
    	}
    	if(head.next == null) { // linkedlist chỉ có 1 node
    		return head;
    	}
    	
    	// trường hợp bài toán tổng quát
    	ListNode nextNode = head.next;
    	ListNode newHead = reverseList(nextNode); // gọi đệ qui
    	nextNode.next = head; // cập nhật lại head
    	head.next = null; 
    	
    	return newHead;
    }
    
    public static void print(ListNode head) {
    	while(head != null) {
    		System.out.println(head.val);
    		head = head.next;
    	}
    	System.out.println();
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		print(n1);
		ListNode newList = reverseList(n1);
		print(newList);
	}

}
