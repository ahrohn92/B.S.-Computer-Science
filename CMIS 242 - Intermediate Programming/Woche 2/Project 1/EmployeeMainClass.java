/*
 * Course:  	CMIS 242
 * File: 	EmployeeMain.java
 * Author: 	Andrew H. Rohn
 * Date: 	1 September 2018
 * Purpose: 	EmployeeMain Class, which contains the main method. It reads employee information from a text file. 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import static java.lang.System.out;

public class EmployeeMain {

    //private list as created
    private List<Employee> employeeSalary_2015;
    private List<Employee> employeeSalary_2014;

    //new arg constructor passing no arguments
    public EmployeeMain() {
        employeeSalary_2015 = new ArrayList<Employee>();
        employeeSalary_2014 = new ArrayList<Employee>();
    }

    //method main
    public static void main(String[] args) {

        //creating instances for the class
        EmployeeMain readEmployeeDataFile = new EmployeeMain();
        readEmployeeDataFile.run();
    }

    private void run() {

        //file implementation
        String employeeDataFile = "EmployeeList.txt";
        Scanner file1 = null;
        try {
            file1 = new Scanner(new BufferedReader(new
                FileReader(employeeDataFile)));
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex);
            System.exit(1);
        }
        while (file1.hasNext()) {
            String line1 = file1.nextLine();
            processLine(line1);
        }

        //closing the file
        file1.close();

        //printing the reports
        employeeDataReport();
    }

    //object created with appropriate type
    private void processLine(String line1) {
        StringTokenizer tVal = new StringTokenizer(line1);
        int yearOf = Integer.parseInt((tVal.nextToken()));
        List chosenYear = yearOf == 2014 ? employeeSalary_2014:
        employeeSalary_2015;
        String employeeTypeE = tVal.nextToken();
        String employeeName = tVal.nextToken();
        Integer employeeMonthlySalary =
        Integer.parseInt(tVal.nextToken());
        Employee newEmployee = null;
        if (employeeTypeE.equals("Salesman")) {
            Integer salesmanCommission=
            Integer.parseInt(tVal.nextToken());

            newEmployee = new Salesman(employeeName, employeeMonthlySalary, salesmanCommission);

        }
        else if (employeeTypeE.equals("Executive")) {
            Integer stockPrice= Integer.parseInt(tVal.nextToken());
            newEmployee = new Executive(employeeName, employeeMonthlySalary, stockPrice);
            }
        else {
            newEmployee = new Employee(employeeName, employeeMonthlySalary);
        }
        chosenYear.add(newEmployee);
    }

    private void employeeDataReport() {
        out.println("\nEMPLOYEE DATA FOR 2014:\n");
        int i;
        for (i = 0; i < (employeeSalary_2014.size()); i++) {
            Employee employeeObj = employeeSalary_2014.get(i);
            if (employeeObj instanceof Salesman) {
                Salesman salesmanObj = (Salesman) employeeObj;
                out.println("\nPosition: Salesman " +salesmanObj);
            }
            else if (employeeObj instanceof Executive) {
                Executive executiveObj = (Executive) employeeObj;
                out.println("\nPosition: Executive " +executiveObj);
            }
            else {
                out.println("\nPosition: Employee " +employeeObj);
            }
        }
        out.println("\nEMPLOYEE DATA FOR 2015:\n");
        int j;
        for (j = 0; j < (employeeSalary_2015.size()); j++) {
            Employee employeeObj = employeeSalary_2015.get(j);
            if (employeeObj instanceof Salesman) {
                Salesman salesmanObj = (Salesman) employeeObj;
                out.println("\nPosition: Salesman "+salesmanObj);
            }
            else if (employeeObj instanceof Executive) {
                Executive executiveObj = (Executive) employeeObj;
                out.println("\nPosition: Executive "+executiveObj);
            }
           else {
                out.println("\nPosition: Employee "+employeeObj);
            }
        }
        printAverageAnnualSalariesOf();
    }

    private void printAverageAnnualSalariesOf() {
        int sumSalaries1 = 0;
        for (int i = 0; i < employeeSalary_2014.size(); i++) {
            sumSalaries1 += employeeSalary_2014.get(i).getAnnualSalary();
        }
        out.println("\nThe average salary for 2014 was "+(sumSalaries1 / employeeSalary_2014.size()));
        sumSalaries1 = 0;
        for (int i = 0; i < employeeSalary_2015.size(); i++) {
            sumSalaries1 += employeeSalary_2015.get(i).getAnnualSalary();
        }
        out.println("The average salary for 2015 was "+(sumSalaries1 / employeeSalary_2015.size()));
    }
}