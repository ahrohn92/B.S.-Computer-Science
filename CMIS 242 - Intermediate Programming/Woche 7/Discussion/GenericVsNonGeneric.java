/*
 * Course:  	CMIS 242
 * File: 	GenericVsNonGeneric.java
 * Author: 	Andrew H. Rohn
 * Date: 	4 October 2018
 * Purpose: 	Demonstrates The Use of a Generic Method vs Non-Generic Methods
 */


public class GenericVsNonGeneric {

	public static void main(String args[]) {
		
		// Arrays of Various Data Types
		String[] studentName = {"Jason", "Ellie", "Thomas", "Gary", "Angela", "Robert"};
		Integer[] studentAge = {22, 20, 19, 35, 27, 24};
		Double[] studentScore = {87.4, 92.3, 90.1, 86.5, 97.4, 89.7};
		
		// Print Non-Generic Methods
		System.out.println("\n-------------------------NON-GENERIC--------------------------\n");
		printNonGen(studentName);
		printNonGen(studentAge);
		printNonGen(studentScore);
		
		// Print Generic Method
		System.out.println("\n\n---------------------------GENERIC----------------------------\n");
		System.out.print("Student Name:");
		printGen(studentName);
		System.out.print("Student Age:");
		printGen(studentAge);
		System.out.print("Student Score:");
		printGen(studentScore);
	}
	
	// Non-Generic Methods
	public static void printNonGen(String[] input) {
		System.out.print("Student Name:");
		for (String x : input) {
			System.out.printf("\t%s", x);
		}
		System.out.println();
	}
	public static void printNonGen(Integer[] input) {
		System.out.print("Student Age:");
		for (Integer x : input) {
			System.out.printf("\t%s", x);
		}
		System.out.println();
	}
	public static void printNonGen(Double[] input) {
		System.out.print("Student Score:");
		for (Double x : input) {
			System.out.printf("\t%s", x);
		}
		System.out.println();
	}
	
	// Generic Method
	public static <A> void printGen(A[] input) {
		for(A x : input) {
			System.out.printf("\t%s", x);
		}
		System.out.println();
	}

}
