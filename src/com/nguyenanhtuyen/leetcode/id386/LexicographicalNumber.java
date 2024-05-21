package com.nguyenanhtuyen.leetcode.id386;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumber {
	
	private List<Integer> listNums = new ArrayList<>();
	private int max = 0;
	
	private void dfs(int base) {
		if(base <= max) {
			for(int i=0; i<10; i++) {
				int newNumber = base * 10 + i;
				if(newNumber != 0 && newNumber <= max) {
					listNums.add(newNumber);
					dfs(newNumber);
				}
			}
		}
	}
	
    public List<Integer> lexicalOrder(int n) {
        max = n;
        dfs(0);
        return listNums;
    }

	public static void main(String[] args) {
		LexicographicalNumber test = new LexicographicalNumber();
		List<Integer> listNums = test.lexicalOrder(13);
		for(int num : listNums) {
			System.out.println(num);
		}
	}

}
