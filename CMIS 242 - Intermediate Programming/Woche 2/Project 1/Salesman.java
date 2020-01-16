/*
 * Course:  	CMIS 242
 * File: 	Salesman.java
 * Author: 	Andrew H. Rohn
 * Date: 	1 September 2018
 * Purpose: 	Salesman Subclass of Employee Class, which contains an additional instance variable
 *              that contains the annual sales in whole dollars for that salesman.
 */

public class Salesman extends Employee {

    // Variable Definition
    protected int salesmanAnnualSales;
    protected double salesmanCommission;

    // A constructor that allows the name, monthly salary and annual sales to be initialized
    protected Salesman(String salesmanName, int salesmanMonthlySalary, int salesmanAnnualSales) {
        super (salesmanName, salesmanMonthlySalary);
        this.salesmanAnnualSales = salesmanAnnualSales;
        this.salesmanCommission = Math.min(salesmanAnnualSales * 0.02, 20000);  // Mathemaitcal Equation for Salesman's Commission
    }

    // An overridden method annualSalary that returns the salary for a whole year
    protected int getAnnualSalary() {
        return (int) (super.getAnnualSalary() + salesmanCommission);
    }

    // An overridden toString method that returns a string containing the name, monthly salary and annual sales
    public String toString() {
        return "\nSalesman's Name: "+employeeName+"\nSalesman's Monthly Salary: $"+employeeMonthlySalary+
        "\nSalesman's Annual Salary (w/ commission): $"+getAnnualSalary()+"\nSalesman's Annual Sales: $"+salesmanAnnualSales;
    }
}