package com.nguyenanhtuyen.leetcode.id622;

public class MyCircularQueue {
	
	int[] array;
	int size;
	int headIndex;
	int tailIndex;
	int count;

	public MyCircularQueue(int k) {
		size = k;
		array = new int[size];
		headIndex = tailIndex = -1;
		count = 0;
	}

	public boolean enQueue(int value) {
		if(isFull() == false) {
			tailIndex++;
			if(tailIndex == size) {
				tailIndex = 0;
			}
			if(isEmpty() == true) {
				headIndex = tailIndex;
			}
			array[tailIndex] = value;
			return true;
		}
		return false;
	}

	public boolean deQueue() {
		if(isEmpty() == true) {
			return false;
		}
		headIndex++;
		if(headIndex == size) {
			headIndex = 0;
		}
		count--;
		return true;
	}

	public int Front() {
		return isEmpty() ? -1 : array[headIndex];
	}

	public int Rear() {
		return isEmpty() ? -1 : array[tailIndex];
	}

	public boolean isEmpty() {
		return count<=0;
	}

	public boolean isFull() {
		return count>=size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
