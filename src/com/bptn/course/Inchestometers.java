package com.bptn.course;

import java.util.Scanner;

public class Inchestometers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double meters;		
		System.out.println("Input a value to be converted to meters: ");
		double inches = scan.nextDouble();
		
		meters = inches * 0.0254;
		
		System.out.println(inches + "Inches is equal to " + meters + "meters");
		
		
	}

}
