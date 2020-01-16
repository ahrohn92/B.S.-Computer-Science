/*
 
 * CMIS 141 Homework Assignment 1
 
 * File Name: HomeworkAssignment_1.java
 
 * Author: Andrew H. Rohn
 
 * Date: June 3, 2018
 
 * Purpose: This program takes data inputted by the user to find the average of 
 
 * three quizzes, convert age in months to age in years, and to convert degrees
 
 * Celsius into degress Fahrenheit.
 
 */



import java.util.Scanner;



public class HomeworkAssignment_1

{
	
	public static void main (String[] args)	{



		// Variable Definition
		
		int studentEMPLID;
		
		double quizScore1;
		
		double quizScore2;
		
		double quizScore3;
		
		double sumQuizScore;
		
		double avgQuizScore;
		
		int ageMonths;
		
		int ageYears;
		
		double tempCelsius;
		
		double tempFahrenheit;

		String degree = "\u00B0";	    
	   

		// User Input
	    
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter your Student EMPLID (0-999999): ");
	    
		studentEMPLID = input.nextInt();
	    
		System.out.println("Enter your Quiz 1 percentage score (0.0 - 100.0): ");
	    
		quizScore1 = input.nextDouble();
	    
		System.out.println("Enter your Quiz 2 percentage score (0.0 - 100.0): ");
	    
		quizScore2 = input.nextDouble();
	    
		System.out.println("Enter your Quiz 3 percentage score (0.0 - 100.0): ");
	    
		quizScore3 = input.nextDouble();
	    
		System.out.println("Enter your age in months (0-1440): ");
	    
		ageMonths = input.nextInt();
	    
		System.out.println("Enter the current temperature in degrees Celsius: ");
	    
		tempCelsius = input.nextDouble();
	    
	    

		// Average of Quiz Scores
	    
		sumQuizScore = quizScore1 + quizScore2 + quizScore3;
	    
		avgQuizScore = sumQuizScore / 3;
	   
	    

		// Age in years
	    
		ageYears = ageMonths / 12;
	    
	    

		// Conversion from Celsius to Fahrenheit
	    
		tempFahrenheit = (tempCelsius * 9/5) + 32;
	    
	    

		// Output
	    
	    
		System.out.println("*** Thank You ***");
	    
		System.out.println("Student EMPLID: "+studentEMPLID);
	    
		System.out.println("Quiz 1 Score: "+quizScore1);
	    
		System.out.println("Quiz 2 Score: "+quizScore2);
	    
		System.out.println("Quiz 3 Score: "+quizScore3);
	    
		System.out.println("Average quiz score: "+avgQuizScore);
	    
		System.out.println("Age in months: "+ageMonths);
	    
		System.out.println("Age in years: "+ageYears);
	    
		System.out.println("Temperature in Celsius: "+tempCelsius+""+degree+"C");
	    
		System.out.println("Temperature in Fahrenheit: "+tempFahrenheit+""+degree+"F");
	    
	

	} // End main



} // End class