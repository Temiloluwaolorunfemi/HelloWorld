package com.bptn.course;

	import java.util.Scanner;

	public class Wordcalculator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			boolean a = true;
			while(a){
			
			System.out.println("/................String Menu................/");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Enter the option:");
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			
			if (choice > 0 && choice < 6){

			    if(choice ==1){
			    	System.out.println("String comparison");
			    	System.out.println("Enter the string");
			    	Scanner scan1 = new Scanner(System.in);
					String palindromeString = scan1.nextLine();
					//palindromeString = String palindrome;
					char[] arr = palindromeString.toCharArray();
					
					String rev = "";
					
					for (int i = palindromeString.length() - 1; i >=0 ;i--) {
						rev = rev + palindromeString.charAt(i);
					}
					 
					 String newRev = rev.toString();
					 
					if (palindromeString.equals(newRev)) {
						
						System.out.println("It is a palindrome");
					}
					else {

						System.out.println("It is not a palindrome");
					}
			    }	
					
					
			    else if (choice ==2){
			    	System.out.println("String Reversal");
			    	System.out.println("Enter the string");
			    	Scanner scan2 = new Scanner(System.in);
					String palindromeString = scan2.nextLine();
					
					char[] arr = palindromeString.toCharArray();
					
					String rev = "";
					
					for (int i = palindromeString.length() - 1; i >=0 ;i--) {
						rev = rev + palindromeString.charAt(i);
					}
					System.out.println(rev + " is the reversed string");
			    }
			     else if (choice ==3){
			    	System.out.println("Enter the first string");
			    	Scanner scan3 = new Scanner(System.in);
			    	String firstStr = scan3.nextLine();

			 		System.out.println("Enter the second string");
			 		Scanner scan4 = new Scanner(System.in);
			 		String secondStr = scan4.nextLine();
			 		
			 		System.out.println("the concartination of " + firstStr + "and " + secondStr + "is:");
			 		System.out.println(firstStr +" "+ secondStr);
			    }
			     else if (choice ==4){
			        System.out.println("String Comparison " );
			        System.out.println("Enter the first string");
			        Scanner scan5 = new Scanner(System.in);
			 		String firstStr = scan5.nextLine();

			 		System.out.println("Enter the second string");
			 		Scanner scan6 = new Scanner(System.in);
			 		String secondStr = scan6.nextLine();
			 		
			 		if (firstStr == secondStr) {
						System.out.println("The strings are equal");
					}
					else {

						System.out.println("The strings aren't equal");
					}
			    }
			     else if (choice ==5){
			    	 System.out.println("String Length");
				     System.out.println("Enter the string");
				     Scanner scan7 = new Scanner(System.in);
					 String lengthofString = scan7.nextLine();
					 
					 System.out.println("The length of string " + lengthofString + " is:" + lengthofString.length());
						
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
