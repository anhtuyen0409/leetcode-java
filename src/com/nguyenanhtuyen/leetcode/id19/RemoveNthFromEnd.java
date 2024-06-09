package com.nguyenanhtuyen.leetcode.id19;

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

public class RemoveNthFromEnd {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curNode = head;
		ListNode wantedNode = null;
		int count = 1;
		while(curNode != null) {
			if(count == n+1) {
				wantedNode = head;
			}
			if(curNode.next == null) {
				if(wantedNode == null) {
					if(count == n) {
						return head.next;
					}
					return head;
				} else {
					if(wantedNode.next != null) {
						wantedNode.next = wantedNode.next.next;
					}
					return head;
				}
			}
			count++;
			curNode = curNode.next;
			wantedNode = wantedNode == null ? null : wantedNode.next;
		}
		return head;
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
		removeNthFromEnd(n1, 2);
		print(n1);
	}

}
