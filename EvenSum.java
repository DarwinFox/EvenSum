//******************************************************************************************
//EvenSum.java		 	Author: Harrison Fox 
//
//Implements a main method to read an integer value from a user and prints the sum of all 
//even integers between 2 and the input value inclusive.
//******************************************************************************************

import java.util.*;

public class EvenSum {

	public static void main (String[] args){
		String userInput;
		int num;
		int sum = 0;
		int done = 1;

		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to EvenSum would you like to sum all even integers between 2 and your number?");
		System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
		userInput = scan.next();

		IntTest test = new IntTest(userInput);
		if(test.isValid()){
			done = test.getInt();
		}
		else{
			done = 0;
		}


		while (done > 0){

			System.out.println("Please enter a positive integer value greater than or equal to 2 and equal or less than 10000.");
			userInput = scan.next();

			test.intTest(userInput);	
			num = test.getInt();

			if (test.isValid() && num >= 2 && num <= 10000){ // This if statement provides proper bounds checking for the number entered
				
				for(int count = 2; count <= num; count += 2){
					sum += count;
				}
				System.out.println("The sum of all even integers between your number and 2 is equal to: " +sum);
				System.out.println();
				sum = 0;
			}
			else{
				System.out.println("The number you entered is not a positive integer value greater than or equal to 2 and equal or less than 10000.");
			}

			System.out.println("Would you like to sum all even integers between 2 and another number??");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
			userInput = scan.next();
			if(test.intTest(userInput)){
				done = test.getInt();
			}
			else{
			done = 0;
			}
		}
		
		System.out.println();
		System.out.println("Thank you for using EvenSum!" + "\n");
	}
}
