package com.nguyenanhtuyen.leetcode.id328;

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

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {
		int index = 1;
		ListNode curNode = head;
		ListNode lastOddNode = null;
		ListNode lastEvenNode = null;
		while (curNode != null) {
			ListNode nextNode = curNode.next;
			if (index == 1) {
				lastOddNode = curNode;
			} else if (index == 2) {
				lastEvenNode = curNode;
			}
			if (index > 2) {
				if (index % 2 != 0) {

					curNode.next = lastOddNode.next;
					lastOddNode.next = curNode;
					lastEvenNode.next = nextNode;
				} else {
					lastEvenNode = lastEvenNode.next;
					lastOddNode = lastOddNode.next;
				}
			}
			index++;
			curNode = nextNode;
		}
		return head;
	}

	public static void print(ListNode head) {
		while (head != null) {
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
		ListNode newListNode = oddEvenList(n1);
		print(newListNode);
	}

}
