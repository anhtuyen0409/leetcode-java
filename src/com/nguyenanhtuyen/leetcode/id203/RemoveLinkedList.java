package com.nguyenanhtuyen.leetcode.id203;

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

public class RemoveLinkedList {

	public static ListNode removeElements(ListNode head, int val) {
		ListNode curNode = head;
		ListNode prevNode = null;
		while(curNode != null) {
			boolean check = false;
			if(curNode.val == val) {
				check = true;
				if(prevNode == null) {
					head = curNode.next;
				}
				else {
					prevNode.next = curNode.next; // update next
				}
			}
			prevNode = check==true ? prevNode : curNode;
			curNode = curNode.next;
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
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(5);
		ListNode node7 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4; 
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode list = removeElements(node1, 6);
		
		print(list);
	}

}
