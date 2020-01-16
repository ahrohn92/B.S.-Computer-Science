/*
 * Course:  	CMIS 242
 * File: 	Student.java
 * Author: 	Andrew H. Rohn
 * Date: 	13 October 2018
 * Purpose: 	Defines the Student Record.
 */

import java.text.DecimalFormat;

public class Student {

	// Instance Variable Definition
	private String studentName;
	private String studentMajor;
	private double totalNumCredits;
	private double totalQualityPoints;
	
	// Constructor Method
	public Student(String studentName, String studentMajor) {
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		totalQualityPoints = 0;
		totalNumCredits = 0;
	}
	
	// Method for Updating Student Information
	public void courseCompleted(double gradeValue, int numCredits) {
		totalQualityPoints += gradeValue * numCredits;
		totalNumCredits += numCredits;
	}
	
	// Decimal Format for GPA
	DecimalFormat decimalFormat = new DecimalFormat("0.0#");
	
	// toString() Method for Printing Student Information
	public String toString() {
		if (totalNumCredits == 0) {
			return "Name:    "+studentName+"\nMajor:    "+studentMajor+"\nGPA:       4.0";
		}
		else {
			return "Name:    "+studentName+"\nMajor:    "+studentMajor+"\nGPA:       "
					+decimalFormat.format(totalQualityPoints/totalNumCredits);
		}
	}
}