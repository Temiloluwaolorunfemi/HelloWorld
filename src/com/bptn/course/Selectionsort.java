package com.bptn.course;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of arrays you want");
		int limit = scan.nextInt();
		int[] arr = new int[limit];
		System.out.println("Enter the numbers in the array");
		for(int i=0; i< arr.length;i++) {
			
			arr[i]= scan.nextInt();
		}
		
		for(int i = 0; i< arr.length - 1; i++) {
			
			int index = i;
			for(int j = i + 1; j< arr.length; j++) {
				if (arr[index]> arr[j]) {
					index = j;
				}
			}
			
			int temp = arr[index];
			arr[index]= arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}



