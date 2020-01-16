/*
 * Course:  	CMIS 242
 * File: 		ExceptionPropagationExample.java
 * Author: 		Andrew H. Rohn
 * Date: 		9 September 2018
 * Purpose: 	Throws an exception that is not caught
 */

import java.io.IOException;

public class ExceptionPropagationExample {
	
	public static void main(String[] args) {
	methodTwo();  // calls second method
	}
	
	// Exception occures in methodOne and moves up the stack
	public static void methodOne()throws Exception {
		throw new IOException("IO Exception"); // throws io exception
	}
	//Second method where exception propagates from first to second method
	public static void methodTwo() {
		try {
			System.out.print("\nThe exception propagates up the stack");
			System.out.println(" from methodOne() to methodTwo()\n");

			methodOne(); // calls second method
		} catch(Exception e) { // catches the exception
           e.printStackTrace();    // displays the path that the exception was propagated  
		}
	}

}