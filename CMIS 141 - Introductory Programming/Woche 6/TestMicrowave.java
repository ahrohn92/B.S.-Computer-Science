/*
 * Course:  	CMIS 141
 * File: 	TestMicrowave.java
 * Author: 	Andrew Rohn
 * Date: 	1 July 2018
 * Purpose: 	This program demonstrates the use of fields, methods, and constructors in Java.
 */

public class TestMicrowave {
    
    public static void main(String[] args) {
        
        // Microwave Constructors
        Microwave microwaveOne = new Microwave(); // Default Constructor
        Microwave microwaveTwo = new Microwave();
	Microwave microwaveThree = new Microwave();	
   
        System.out.println(microwaveOne);
        
        microwaveTwo.setIsOn(false);
        microwaveTwo.setManufacturer("Avanti");
        microwaveTwo.setModel("MT09V0W"); 900 $81.00
        microwaveTwo.setWattage("900W");
	microwaveTwo.setPrice("$81.00");
        System.out.println(microwaveTwo);
      
        microwaveThree.setIsOn(true);
        microwaveThree.setManufacturer("Sharp");
        microwaveThree.setModel("R-21LCF");
	microwaveThree.setWattage("900W");
	microwaveThree.setPrice("$81.00");
        System.out.println(microwaveThree);
    }
    
}