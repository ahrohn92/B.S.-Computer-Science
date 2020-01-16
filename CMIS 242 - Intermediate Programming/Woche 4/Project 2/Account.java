
/*
 * Course:  		CMIS 242
 * File: 		Account.java
 * Author: 		Andrew H. Rohn
 * Date: 		15 September 2018
 * Purpose:		Contains a constructor plus a method that corresponds to each of the four buttons in the GUI.
 */

public class Account {

	// Variable Definition
    private double balance;
    private int numWithdrawals = 0;

    // Default constructor for subclasses
    public Account() {

    }

    // Set Method for the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Get Method for the account balance
    public double getBalance() {
        return this.balance;
    }


    // Checking and Savings subclasses
    public class Checking extends Account {

        public Checking() {
        }
    }

    // Subclass for Savings accounts
    public class Savings extends Account {

        public Savings() {
        }
    }


    // Constructors Methods for each of the Action Listeners
    
    // Constructor Method for Withdrawal Action Listener
    public void withdraw(double withdrawalAmount) throws InsufficientFunds {
    	 // If amount withdrawn brings balance to less than 0, an exception is thrown
        if (this.balance - withdrawalAmount < 0) {
            throw new InsufficientFunds(); 
        }
        // Service Fee after 4 withdrawals
        if (numWithdrawals >= 4) {
        	ATM.serviceFee();
        	this.balance = this.balance - 1.50;
        }
        this.balance = this.balance - withdrawalAmount;
        numWithdrawals++;
    }

    // Constructor Method for Deposit Action Listener
    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    // Constructor Method for the Transfer To Action Listener
    public void transferFrom(double transferFromAmount) throws InsufficientFunds {
        //  // If amount transferred brings balance to less than 0, an exception is thrown
        if (this.balance - transferFromAmount < 0) {
            throw new InsufficientFunds();
        }
        this.balance = this.balance - transferFromAmount;
    }
    
    // Constructor Method for TransferTo Action Listener
    public void transferTo(double balanceToAmount) {
        this.balance = this.balance + balanceToAmount;
    }
}