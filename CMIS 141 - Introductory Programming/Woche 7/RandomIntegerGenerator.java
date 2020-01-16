/*
 
 * Course:      CMIS 141
 
 * File:        RandomIntegerGenerator.java
 
 * Author:      Andrew H. Rohn
 
 * Date:        7 July 2018
 
 * Purpose:     This program generates X random integer values between 0 and Y.
 
 */
 


import java.util.Scanner;

import java.util.Random;



public class RandomIntegerGenerator {
    
	public static void main(String args[]) {

    

		// Variable Definition
    
		int X;
    
		int Y;
		boolean rejectX = true;
		boolean rejectY = true;
    
    
    
		// User Input for Integer X
    
		Scanner input = new Scanner (System.in);
    
		System.out.println("\nThis program generates X random integer values between 0 and Y.\n");
    
		System.out.println("Input an integer for X.\n");
    
		X = input.nextInt();
	
		// Integer X Validation	
		while (rejectX) {
			if (X > 0) {
 
				rejectX = false;                  
			}
        
			else {
                        
				System.out.println("\nPlease input a positive integer.\n");

        			X = input.nextInt();

			}

		}      
    
    

		// User Input for Integer Y
      
		System.out.println("\nInput an integer for Y.\n");
 
		Y = input.nextInt();

      
		// Integer Y Validation
		while (rejectY) {
      
			if (Y > 0) {
            
				rejectY = false;
        
			}
        
			else {
                       
				System.out.println("\nPlease input a positive integer.\n");
 
				Y = input.nextInt();       
			}
    
		}
    
    

		// Random Integer Generation & Output    
		Random randomIntegerGen = new Random();
       
    
		System.out.println("\nRandom Integers:\n");
		for (int count = 0; count < X; count++) {
               
			int randomInt = randomIntegerGen.nextInt(Y+1);
               
			System.out.println("" +randomInt);
    
		}
    
    
	}

}