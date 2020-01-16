/*
 * Course:  	CMIS 242
 * File: 	Employee.java
 * Author: 	Andrew H. Rohn
 * Date: 	1 September 2018
 * Purpose: 	Employee Class, which contains the employee's name and monthly salary.
 */

public class Employee {

    // Variable Definition
    protected String employeeName;
    protected int employeeMonthlySalary;

    // A constructor that allows the name and monthly salary to be initialized
    protected Employee(String employeeName, int employeeMonthlySalary) {
        this.employeeName = employeeName;
        this.employeeMonthlySalary = employeeMonthlySalary;
    }
    
    // A method named annualSalary that returns the salary for a whole year
    protected int getAnnualSalary() {
        int employeeAnnualSalary = employeeMonthlySalary * 12;
        return employeeAnnualSalary;
    }

    // A toString method that returns a string containing the name and monthly salary
    public String toString() {
        return "\nEmployee's Name: "+employeeName+"\nEmployee's Monthly Salary: $"+
        employeeMonthlySalary+"\nEmployee's Annual Salary: $"+getAnnualSalary();
    }
}