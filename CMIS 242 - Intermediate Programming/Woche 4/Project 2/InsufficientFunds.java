/*
 * Course:  		CMIS 242
 * File: 		InsufficientFunds.java
 * Author: 		Andrew H. Rohn
 * Date: 		15 September 2018
 * Purpose: 		Throws an exception when an account balance is less than 0
 */


import javax.swing.*;

public class InsufficientFunds extends Exception {

	// An exception that is thrown when account balance is less than 0
    public InsufficientFunds() {
        JOptionPane frame = new JOptionPane();
        JOptionPane.showMessageDialog(frame, "There are insufficient funds in this account to complete this transaction.");
    }
}