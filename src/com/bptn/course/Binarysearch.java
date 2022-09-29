package com.bptn.course;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int binarysearch( int[] arr, int key) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
		int middle = (left + right)/2;
		
		if (key < arr[middle]) {
			right = middle -1;
		}
		else if(key > arr[middle]) {
			left = middle + 1;
		}
		else if (key == arr[middle] ) {
			return middle;
		}
		}
		
	}
	
	public static int Stringbinary( String[] arr, String key) {
		int left = 0;
		int right = arr.length - 1;
		int middle = 0;
		
		while(left <= right) {
			middle = (left + right) /2;
			
			if (key.compareTo(arr[middle])< 0) {
				right = middle - 1;
				}
			else if (key.compareTo(arr[middle]) > 0) {
				left = middle + 1;
			}
			else if (key.compareTo(arr[middle])==0) {
				return middle;
			}
			
			}
			return -1;
		}
	}

