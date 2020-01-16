/*
 
 * Course:      CMIS 141
 
 * File:        PrintRandNumberArray.java
 
 * Author:      Andrew H. Rohn
 
 * Date:        22 June 2018
 
 * Purpose:     This program generates random numbers between 1 and 100 and saves them in an array, randNumberArray[].
 */
 

import java.util.Scanner;
import 
java.util.Random;



public class PrintRandNumberArray {
    
	public static void main(String args[]) {
        
        
	
		// Variable Definition
		
		int randNumber;
		int numRandNumber;
       
        

		// User input that determines number of random numbers
 
		
		System.out.println("This program generates random numbers between 1 and 100 and saves them in an array, randNumberArray[].");
        
        
		System.out.println("How many numbers would you like to generate?\n");       
		Scanner input = new Scanner (System.in);
        
		int numRandNumbers = input.nextInt();

        
        
		// Population of randNumberArray[] with random numbers and print statements
		
		Random randNumberGen = new Random();
        
		int randNumberArray[] = new int[numRandNumbers];
        
        

		for (int count = 0; count < numRandNumbers; count++) {
            
			numRandNumber = count + 1;
			randNumber = 1 + randNumberGen.nextInt(100);
            
			randNumberArray[count] = randNumber;
           
			System.out.println("Random number "+numRandNumber+", saved in the index randNumberArray["+count+"], is "+randNumberArray[count]+".");
        
		}
    
	}

}