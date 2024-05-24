package com.nguyenanhtuyen.leetcode.id21;

import java.util.LinkedList;

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

public class MergeTwoSortedList {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// điều kiện dừng
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		if(list1.val <= list2.val) { // lấy 1 node của list1
			ListNode nextL1 = list1.next; // lấy node tiếp theo của list1
			ListNode nextElement = mergeTwoLists(nextL1, list2); // gọi đệ qui -> tiếp tục xét
			list1.next = nextElement; // cập nhật next sau merge
			return list1;
		} else {
			mergeTwoLists(list2, list1);
			return list2;
		}
	}
	
	public static void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		
		ListNode newList = mergeTwoLists(l1, n1);
		printLinkedList(newList);
	}

}
