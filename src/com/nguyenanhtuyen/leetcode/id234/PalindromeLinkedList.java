package com.nguyenanhtuyen.leetcode.id234;

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

public class PalindromeLinkedList {

	public int count(ListNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public ListNode reverse(ListNode head) {
		ListNode lastNode = head;
		while(lastNode != null && lastNode.next != null) {
			ListNode nextNode = lastNode.next;
			lastNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;
		}
		return head;
	}

	public boolean isPalindrome(ListNode head) {
		int n = count(head);
		int k = n/2;
		if(k == 0) {
			return true;
		}
		int index = 0;
		ListNode curNode = head;
		
		while(curNode != null) {
			if(index == (n%2==0 ? k : (k+1))) {
				break;
			}
			index++;
			curNode = curNode.next;
		}
		
		ListNode reverseList = reverse(curNode);
		index = 0;
		while(index < k) {
			if(head.val != reverseList.val) {
				return false;
			}
			head = head.next;
			reverseList = reverseList.next;
			index++;
		}
		return true;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		PalindromeLinkedList test = new PalindromeLinkedList();
		System.out.println(test.isPalindrome(node4));
	}

}
