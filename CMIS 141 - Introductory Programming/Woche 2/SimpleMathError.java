/**
 * Course:	CMIS 141
 * File:	SimpleMathError.java
 * Author:	Andrew Rohn
 * Date: 	6/03/2018
 * Purpose: 	To sum two integers. However the program won't compile because of an error.
*/

import java.util.Scanner;

public class SimpleMathError {
	public static void main(String[] args) {
		
		
		
		int number1;
		int number2;
		int number3;

		// User Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		number1 = input.nextInt();
		System.out.println("Enter the second number: ");
		number2 = input.nextLine();

		// Sum Equation
		number3 = number1 + number2;

		// Output
		System.out.println("The sum of "+number1+" and "+number2+" is "+number3);
	}
}