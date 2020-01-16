import java.text.DecimalFormat;

/*
 * Course:  	CMSC 451
 * File: 		CMSC451HW6.java
 * Author: 		Andrew H. Rohn
 * Date: 		5 May 2019
 * Purpose: 	Implements Warshall's and Floyd's algorithms to solve Homework 6 problems.
 */

public class CMSC451HW6 {

	static double INF = Double.POSITIVE_INFINITY;
	
	// Warshall's Algorithm
	public void warshalls(double[][] matrix) {
		
		// Reflexive
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][i] = 1;
		}
		System.out.println("Reflexive\n");
		printMatrix(matrix);
		
		// Transitive
		System.out.println("Transitive\n");
		for (int k = 0; k < matrix.length; k++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if ((matrix[i][j] == 0) && ((matrix[i][k] == 1) && (matrix[k][j] == 1))) {
						matrix[i][j] = 1;
					}
				}
			}
			printMatrix(matrix);
		}
	}
	
	// Floyd's Algorithm
	public void floyds(double[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					matrix[i][j] = 0;
				} else if (matrix[i][j] == 0) {
					matrix[i][j] = INF;
				}
			}
		}
		
		for (int k = 0; k < matrix.length; k++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = Math.min(matrix[i][j], (matrix[i][k] + matrix[k][j]));
				}
			}
		}
		printMatrix(matrix);
	}
	
	// Simplified Floyd's Algorithm
	public void simpleFloyds(double[][] matrix) {
		
		for (int k = 0; k < matrix.length; k++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = Math.min(matrix[i][j], (matrix[i][k] + matrix[k][j]));
				}
			}
			printMatrix(matrix);
		}
	}
	
	// Prints Matrix
	public void printMatrix(double[][] matrix) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (j == (matrix.length - 1)) {
					System.out.println(df.format(matrix[i][j]));
				} else {
					System.out.print(df.format(matrix[i][j])+" ");
				}
			}
		}
		System.out.println();
	}
	
	// Main Method
	public static void main(String args[]) {
		
		CMSC451HW6 main = new CMSC451HW6();
	
		// Problem 1
		System.out.println("Homework Problem #1:\n");
//		double[][] matrixOne = {{0,1,0,0,0},{1,0,0,0,1},{1,0,0,1,0},{0,0,0,1,0},{1,0,0,0,1}};
		double[][] matrixOne = {{0,0,0,0,1},{1,0,0,0,0},{0,0,1,1,0},{0,0,1,0,0},{1,0,1,0,1}};
		main.printMatrix(matrixOne);
		main.warshalls(matrixOne);
	
		// Problem 2
		System.out.println("Homework Problem #2:\n");
//		double[][] matrixTwo = {{0,1,0,0,0},{1,0,0,0,1},{1,0,0,1,0},{0,0,0,1,0},{1,0,0,0,1}};
		double[][] matrixTwo = {{0,0,0,0,1},{1,0,0,0,0},{0,0,1,1,0},{0,0,1,0,0},{1,0,1,0,1}};
		main.printMatrix(matrixTwo);
		main.floyds(matrixTwo);
		
		// Problem 3
		System.out.println("Homework Problem #3:\n");
//		double[][] matrixThree = {{0,1,1,0},{0,0,0,0},{0,0,0,1},{0,0,0,0}};
		double[][] matrixThree = {{0,1,0},{0,0,1},{0,0,0}};
		main.printMatrix(matrixThree);
		main.warshalls(matrixThree);
		
		// Problem 4
		System.out.println("Homework Problem #4:\n");
//		double[][] matrixFour = {{0,1,5,2},{2,0,INF,3},{6,INF,0,-2},{INF,-2,5,0}};
		double[][] matrixFour = {{0,4,INF,5},{2,0,3,3},{INF,2,0,INF},{-2,INF,-4,0}};
		main.printMatrix(matrixFour);
		main.simpleFloyds(matrixFour);
	}
}