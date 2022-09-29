package com.bptn.course;

import java.util.Scanner;

public class switchcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("/................Calculator Menu................/");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		
		int choice = scan.nextInt();
		
		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();

		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();
		
		System.out.println(printCal(num1,num2,choice));
		scan.close();
	}

	public static double printCal(double num1, double num2,int choice){
		
		double result = 0;
		switch(choice) {
		
		case 1:
			result= addition(num1,num2);
			break;
		case 2:
			result = subtraction(num1,num2);
			break;
		case 3:
			result = multiplication(num1,num2);
			break;
		case 4:
			result= division(num1,num2);
			break;
		default:
			break;
							
		}
		return result;
	}
	
	public static double addition(double num1,double num2) {
		return num1 + num2;
	}
	
	public static double subtraction(double num1,double num2) {
		return num1 - num2;
	}
	
	public static double multiplication(double num1,double num2) {
		return num1 * num2;
	}
	
	public static double division(double num1,double num2) {
		return num1 / num2;
	}
}
