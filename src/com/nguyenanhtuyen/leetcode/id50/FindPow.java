package com.nguyenanhtuyen.leetcode.id50;

public class FindPow {

	public double myPow(double x, int n) {
		// điều kiện dừng
		if(n == 0) {
			return 1;
		}
		int temp = 0;
		if(n < 0) {
			n = -n;
			temp = n%2==0 ? -(n/2) : (-n-1)/2;
			x = 1/x;
		} else {
			temp = n%2==0 ? n/2 : (n-1)/2;
		}
		double t = myPow(x, temp);
		return n%2==0 ? (t*t) : (x*t*t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
