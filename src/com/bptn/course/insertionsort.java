package com.bptn.course;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements in your array");
		int limit = scan.nextInt();
		int[] arr = new int[limit];
		
		System.out.println("Enter the numbers");
		for(int j= 0; j <arr.length;j++) {
			arr[j]= scan.nextInt();
		}
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int value = i;
			
			while(value > 0 && temp < arr[value - 1]) {
				arr[value]= arr[value - 1];
				value--;
			}
			arr[value] = temp; 
		}
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + ",");
		}
		
	}

	
}






















