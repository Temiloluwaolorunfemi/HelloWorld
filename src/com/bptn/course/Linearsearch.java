package com.bptn.course;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 8, 4, 2, 12, 6 };
		int key = 4;
		int ind = search(a,key);
		System.out.println("Index :" + ind);
	}

	public static int search (int[] a, int key) {
		int ind = -1;
		for (int i=0; i < a.length; i++) {
			
			if(key == a[i]) {
				ind = i;
				break;
			}
		}
		return ind;
	}
}
