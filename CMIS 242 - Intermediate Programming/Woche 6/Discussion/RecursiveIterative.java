/*
 * File: 		RecursiveIterative.java
 * Author: 		Andrew H. Rohn
 * Date: 		30 September 2018
 * Purpose:		Determinds the value of an nth in the sequence 3n + 2, both iteratively and recursively
 */


import java.util.Scanner;

public class RecursiveIterative {

    public static void main(String[] args) {
      
    	// User Prompt
    	System.out.println("\n\nThis program will find the value of the nth term of the number sequence 3n + 2 "
    			+ "using both an iterative and recursive method.");
    	System.out.println("\nPlease enter a posive integer for 'n'.");
      
    	String nthTermS = null;
    	int nthTerm = 0;
      
    	// User Input + Input Validation
    	boolean validInputError = true;
    	while(validInputError) {
	   
		      Scanner input = new Scanner(System.in);
		      nthTermS = input.nextLine();
		      try {
		    	  nthTerm = Integer.parseInt(nthTermS);
		 
		    	  if (nthTerm < 1) {
		    		  System.out.println("\nPlease enter a positive integer.(e.g. 3)\n");
		    	  }
		    	  else {
		    		  validInputError = false;
		    	  }
		      } catch (NumberFormatException e){
		    	  System.out.println("\n"+nthTermS+" is not a valid integer.");
		    	  System.out.println("\nPlease enter a positive integer (e.g. 3)\n");
		      }
	      }
     
	   // Output
	   System.out.println("\nIterative Method:\n");
	   System.out.println("The value of term "+nthTerm+" is "+iterativeMethod(nthTerm)+"\n"); // Calls Iterative Method
	   System.out.println("\nRecursive Method:\n");
	   System.out.println("The value of term "+nthTerm+" is "+recursiveMethod(nthTerm)+"\n"); // Calls Recursive Method
   }
      

    // Iterative Method
    private static int iterativeMethod (int nthTerm) {
        int nthValue = 5;
        for (int i = 1; i < nthTerm; i++) {
        	nthValue = (nthValue * 3) + 2;
        }
        return nthValue;
    }
    
    // Recursive Method
    private static int recursiveMethod (int nthTerm) {
        if (nthTerm == 1) {
            return 5;
	}
        return recursiveMethod(nthTerm - 1) * 3 + 2;       
    }
}
