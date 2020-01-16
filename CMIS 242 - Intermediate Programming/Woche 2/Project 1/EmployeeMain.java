/*
 * Course:  	CMIS 242
 * File: 	EmployeeMain.java
 * Author: 	Andrew H. Rohn
 * Date: 	1 September 2018
 * Purpose: 	EmployeeMain Class, which contains the main method. It reads employee information from a text file,
 *              stores it in two arrays, and prints the arrays in the console. 
 */

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmployeeMain {

    // Arrays storing employee objects of the appropriate type
    private List<Employee> employeeSalaries2015;
    private List<Employee> employeeSalaries2014;

    public EmployeeMain() {
        employeeSalaries2015 = new ArrayList<Employee>();
        employeeSalaries2014 = new ArrayList<Employee>();
    }

    // Main method
    public static void main(String[] args) {

        // Instance variables for the EmployeeMain class
        EmployeeMain readEmployeeDataFile = new EmployeeMain();
        readEmployeeDataFile.read();
    }

    // Function that reads and closes data file
    private void read() {

        // Reads the Data File
        String employeeDataFile = "EmployeeList.txt";
        Scanner readFile = null;
        try {
            readFile = new Scanner(new BufferedReader(new FileReader(employeeDataFile)));
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex);
            System.exit(1);
        }
        while (readFile.hasNext()) {
            String line = readFile.nextLine();
            processLine(line);
        }

        // Closes the Data File
        readFile.close();

        // Prints the Employee Data Report
        printEmployeeDataReport();
    }

    // Creates employee objects  of the appropriate type and stores them in one of two arrays depending upon the year
    private void processLine(String line) {
        StringTokenizer value = new StringTokenizer(line);
        int year = Integer.parseInt((value.nextToken()));
        List selectYear = year == 2014 ? employeeSalaries2014: employeeSalaries2015;
        String employee_Type = value.nextToken();
        String employeeName = value.nextToken();
        Integer employeeMonthlySalary = Integer.parseInt(value.nextToken());
        Employee newEmployee = null;
        if (employee_Type.equals("Salesman")) {
            Integer salesmanCommission = Integer.parseInt(value.nextToken());
            newEmployee = new Salesman(employeeName, employeeMonthlySalary, salesmanCommission);
        }
        else if (employee_Type.equals("Executive")) {
            Integer stockPrice = Integer.parseInt(value.nextToken());
            newEmployee = new Executive(employeeName, employeeMonthlySalary, stockPrice);
            }
        else {
            newEmployee = new Employee(employeeName, employeeMonthlySalary);
        }
        selectYear.add(newEmployee);
    }

    // Prints each line of the report containing all original data supplied for each employee together
    // with that employee's annual salary for the year
    private void printEmployeeDataReport() {
        // For 2014
        System.out.println("\n---EMPLOYEE DATA FOR 2014---\n");
        for (int i = 0; i < (employeeSalaries2014.size()); i++) {
            Employee employeeType = employeeSalaries2014.get(i);
            if (employeeType instanceof Salesman) {
                Salesman salesmanType = (Salesman) employeeType;
                System.out.println("\nType of Employee: Salesman " +salesmanType);
            }
            else if (employeeType instanceof Executive) {
                Executive executiveType = (Executive) employeeType;
                System.out.println("\nType of Employee: Executive " +executiveType);
            }
            else {
                System.out.println("\nType of Employee: Employee " +employeeType);
            }
        }
        // For 2015
        System.out.println("\n---EMPLOYEE DATA FOR 2015---\n");
        for (int i = 0; i < (employeeSalaries2015.size()); i++) {
            Employee employeeType = employeeSalaries2015.get(i);
            if (employeeType instanceof Salesman) {
                Salesman salesmanType = (Salesman) employeeType;
                System.out.println("\nType of Employee: Salesman "+salesmanType);
            }
            else if (employeeType instanceof Executive) {
                Executive executiveType = (Executive) employeeType;
                System.out.println("\nType of Employee: Executive "+executiveType);
            }
            else {
                System.out.println("\nType of Employee: Employee "+employeeType);
            }
        }
        printAverageAnnualSalary();
    }

    // Prints the average salary of all salaries for all employees for each of the two years
    private void printAverageAnnualSalary() {
        int sumSalaries = 0;
        // For 2014
        for (int i = 0; i < employeeSalaries2014.size(); i++) {
            sumSalaries += employeeSalaries2014.get(i).getAnnualSalary();
        }
        System.out.println("\nThe average salary for 2014 was $"+(sumSalaries / employeeSalaries2014.size()));
        sumSalaries = 0;
        // For 2015
        for (int i = 0; i < employeeSalaries2015.size(); i++) {
            sumSalaries += employeeSalaries2015.get(i).getAnnualSalary();
        }
        System.out.println("The average salary for 2015 was $"+(sumSalaries / employeeSalaries2015.size()));
    }
}