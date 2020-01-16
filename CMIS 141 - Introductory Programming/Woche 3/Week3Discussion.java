/*
 
 * Course:      CMIS 141
 
 * File:        Week3Discussion.java
 
 * Author:      Andrew H. Rohn
 
 * Date:        8 June 2018
 
 * Purpose:     This program calculates the average score of any number of quizzes, as determined by the user.
 */
 


import java.util.Scanner;
import java.util.Locale;

public class Week3Discussion{

     
	
	public static void main(String []args){
        
        
		
		// Variable Definition
        
		int numQuiz;
        
		int counter = 0;
        
		double scoreQuiz;
        
		double sumScoreQuiz = 0;
        
		double avgScoreQuiz;
        
        

		// Initial User I/O
        
		Scanner input = new Scanner(System.in);
        
		System.out.print("This program calculates the average score of any ");
        
		System.out.println("number of quizzes, as determined by the user.");
        
		System.out.println("Please enter the number of quizzes (ex. 3): ");
        
		numQuiz = input.nextInt();
        
        

		// While Loop
		while (counter < numQuiz) {
   
		counter++;
         
		Scanner score = new Scanner(System.in).useLocale(Locale.US);
            
		System.out.println("Please enter the score of Quiz "+counter+": ");
            
		scoreQuiz = score.nextDouble();
            
		sumScoreQuiz = sumScoreQuiz + scoreQuiz;
            
       
		}
        
        

		// Mathematical Equation for Average Score
        
		avgScoreQuiz = sumScoreQuiz / numQuiz;
        
        

		// Output
        
		System.out.println("The average of the "+numQuiz+" quizzes is: "+avgScoreQuiz);
        
        
     
	
	}

}