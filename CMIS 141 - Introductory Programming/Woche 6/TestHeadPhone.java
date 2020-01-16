/*
 * Course:  	CMIS 141
 * File: 	TestHeadPhone.java
 * Author: 	Andrew Rohn
 * Date: 	1 July 2018
 * Purpose: 	This program demonstrates the use of fields, methods, and constructors in Java.
 */

import java.awt.Color;

public class TestHeadPhone {
    
    public static void main(String[] args) {
        
        // HeadPhone Constructors
        HeadPhone headPhoneOne = new HeadPhone(); // Default Constructor
        HeadPhone headPhoneTwo = new HeadPhone();
        HeadPhone headPhoneThree = new HeadPhone();
        
        System.out.println(headPhoneOne);
        
        headPhoneTwo.setHeadPhoneColor(Color.WHITE);
        headPhoneTwo.setHeadPhoneModel("WH-1000XM2");
        headPhoneTwo.setManufacturer("Sony");
        headPhoneTwo.setPluggedIn(false);
        System.out.println(headPhoneTwo);
      
        headPhoneThree.setHeadPhoneColor(Color.BLUE);
        headPhoneThree.setHeadPhoneModel("HD 4.50 BTNC");
        headPhoneThree.changeVolume(3);
        headPhoneThree.setManufacturer("Sennheiser");
        headPhoneThree.setPluggedIn(true);
        System.out.println(headPhoneThree);
    }
    
}