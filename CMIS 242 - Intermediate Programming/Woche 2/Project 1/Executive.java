/*
 * Course:  	CMIS 242
 * File: 	Executive.java
 * Author: 	Andrew H. Rohn
 * Date: 	1 September 2018
 * Purpose: 	Executive Subclass of Employee Class, which contains an additional instance variable
 *              that reflects the current stock price.
 */

public class Executive extends Employee {

    // Variable Definition
    protected int stockPrice;
    protected int bonus;

    // A constructor that allows the name, monthly salary and stock price to be initialized
    protected Executive(String executiveName, int executiveMonthlySalary,int stockPrice) {
        super(executiveName, executiveMonthlySalary);
        this.stockPrice = stockPrice;
        this.bonus = (stockPrice >= 50 ? 30000 : 0);  // Mathemaitcal Equation for Executive's Bonus
    }

    // An overridden method annualSalary that returns the salary for a whole year
    protected int getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }

    // An overridden toString method that returns a string containing the name, monthly salary and stock price
    public String toString() {
        return "\nExecutive's Name: "+employeeName+"\nExecutive's Monthly Salary: $"+employeeMonthlySalary+
        "\nExecutive's Annual Salary (w/ bonus): $"+getAnnualSalary()+"\nCurrent Stock Price: $"+ stockPrice;
    }
}