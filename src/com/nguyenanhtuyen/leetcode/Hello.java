package com.nguyenanhtuyen.leetcode;

public class Hello {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Cat cat2 = (Cat) new Animal();
		cat2.sound();
		cat.sound();
	}

}
