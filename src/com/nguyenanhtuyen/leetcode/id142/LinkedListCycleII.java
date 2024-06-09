package com.nguyenanhtuyen.leetcode.id142;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycleII {
	public int checkNode(ListNode curNode) {
		if(curNode == null) {
			return -1;
		}
		ListNode slow = curNode;
		ListNode fast = curNode;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				if(fast == curNode) {
					return 1;
				}
				return 0;
			}
		}
		return -1;
	}
	public ListNode detectCycle(ListNode head) {
		ListNode curNode = head;
		while(curNode != null) {
			int result = checkNode(curNode);
			if(result == -1) {
				return null;
			} else if(result == 1) {
				return curNode;
			} else {
				curNode = curNode.next;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
	}

}
