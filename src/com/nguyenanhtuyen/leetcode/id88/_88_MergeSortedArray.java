package com.nguyenanhtuyen.leetcode.id88;

public class _88_MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int ai : nums2) {
			chenPhanTuVaoMang(ai, nums1, m);
			m++;
		}
	}
	
	// kỹ thuật 2 con trỏ thêm phần tử vào mảng
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // i - duyệt mảng nums1, chạy từ cuối mảng
		int j = n - 1; // j - duyệt mảng nums2, chạy từ cuối mảng
		int k = (m + n) - 1; // k - duyệt mảng mới khi merge - chạy từ cuối mảng
		
		while(k >= 0) {
			if(j < 0 ) {
				nums1[k] = nums1[i];
				i--;
			} else if(i < 0) {
				nums1[k] = nums2[j]; // merge vào mảng nums1
				j--;
			} else if(nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j]; // merge vào mảng nums1
				j--;
			}
			k--;
		}
	}

	private void chenPhanTuVaoMang(int x, int[] a, int m) {
		boolean timDuocK = false;
		for(int k=0; k<m; k++) {
			if(a[k] > x) {
				timDuocK = true;
				for(int i=m-1; i>=k; i--) {
					a[i+1] = a[i];
				}
				a[k] = x;
				break;
			}
		}
		if(timDuocK == false) {
			a[m] = x;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
