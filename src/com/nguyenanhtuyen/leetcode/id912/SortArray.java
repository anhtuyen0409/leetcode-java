package com.nguyenanhtuyen.leetcode.id912;

public class SortArray {
	
	public int[] mergeSort(int a[], int left, int right) {
		if(left > right) {
			return new int[0];
		}
		else if(left == right) {
			int[] singleArray = {a[left]};
			return singleArray;
		}
		// chia mảng
		int k = (left + right)/2;
		// đệ quy
		int a1[] = mergeSort(a, left, k);
		int a2[] = mergeSort(a, k+1, right);
		
		// tiến hành trộn 2 mảng a1 và a2 (a1 và a2 là 2 mảng đã sắp xếp)
		int n = a1.length + a2.length;
		int[] result = new int[n];
		
		int i = 0, i1 = 0, i2 = 0; // i, i1, i2 là index của mảng result, a1 và a2 
		while(i < n) { // mảng chưa đầy
			if(i1 < a1.length && i2 < a2.length) {
				if(a1[i1] <= a2[i2]) { 
					// bỏ a1[i1] vào mảng result
					result[i] = a1[i1]; 
					// tăng index
					i++;
					i1++;
				} else {
					// bỏ a2[i2] vào mảng result
					result[i] = a2[i2]; 
					// tăng index
					i++;
					i2++;
				}
			} else {
				if(i1 < a1.length) {
					result[i] = a1[i1];
					i++;
					i1++;
				} else {
					result[i] = a2[i2]; 
					i++;
					i2++;
				}
			}
		}
		return result;
	}
	
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
