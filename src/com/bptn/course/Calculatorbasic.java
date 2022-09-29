package com.bptn.course;

import java.util.Scanner;

public class Calculatorbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		boolean a = true;
		while(a){
		Scanner scan = new Scanner(System.in);
		System.out.println("/................Calculator Menu................/");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for finding Square");
		System.out.println("Press 6 for finding Square root");
		System.out.println("Press 7 for finding Reciprocal");
		


		int choice = scan.nextInt();

		System.out.println("Enter the first number");
		double firstNum = scan.nextDouble();

		System.out.println("Enter the second number");
		double secondNum = scan.nextDouble();
		if (choice > 0 && choice < 8){

		    if(choice ==1){
		        System.out.println("The sum of the numbers is: " + (firstNum + secondNum ));
		    }
		    else if (choice ==2){
		        System.out.println("The difference betweeen the numbers is: " + (firstNum - secondNum ));
		    }
		     else if (choice ==3){
		        System.out.println("The Product of the numbers is: " + (firstNum * secondNum ));
		    }
		     else if (choice ==4){
		        System.out.println("The division of the numbers is: " + (firstNum / secondNum ));
		    }
		     else if (choice ==5){
		        System.out.println("The square of the first number is: " + (firstNum * firstNum));
		         System.out.println("The square of the first number is: " + (secondNum * secondNum));
		    }
		     else if (choice ==6){
		        System.out.println("The squareroot of the first number is: " + (Math.sqrt(firstNum)));
		        System.out.println("The squareroot of the second number is: " + (Math.sqrt(secondNum)));
		        
		    }
		     else if (choice ==7){
		        System.out.println("The reciprocal of the first number is: " + (1/firstNum));
		         System.out.println("The reciprocal of the first number is: " + (1/secondNum));
		    }

		}
		else{
		    System.out.println("Enter a valid option!!! Restart program");
		}
		   
		System.out.println(" To continue Press 1 else Press any other number to exit");
		int decision = scan.nextInt();
		    if (decision!=1) {
		    	a = false;	    

		    }	
		    
		}
		System.out.println("Goodbye!!!");
		}




	}


