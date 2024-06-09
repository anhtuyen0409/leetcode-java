package com.nguyenanhtuyen.leetcode.id160;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class IntersectionNode {
	
	public boolean isCommon(ListNode curNodeA, ListNode headB) {
		while(headB != null) {
			if(headB == curNodeA) {
				return true;
			}
			headB = headB.next;
		}
		return false;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		while(headA != null) {
			if(isCommon(headA, headB)) {
				return headA;
			}
			headA = headA.next;
		}
		return null;
	}

	public static void main(String[] args) {
	

	}

}
