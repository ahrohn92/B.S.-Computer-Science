/*
 * Course:  		CMIS 242
 * File: 		ATM.java
 * Author: 		Andrew H. Rohn
 * Date: 		15 September 2018
 * Purpose: 		Defines GUI. Contains  main method and a constructor to build the GUI, 
 * 			event handlers will be needed to handle each of the four event handlers.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ATM extends JFrame {

    // Initializing Buttons, RadioButtons and Text Field
    private JButton button1 = new JButton("Withdraw");
    private JButton button2 = new JButton("Deposit");
    private JButton button3 = new JButton("Transfer to");
    private JButton button4 = new JButton("Balance");
    private JRadioButton checking = new JRadioButton("Checking");
    private JRadioButton savings = new JRadioButton("Savings");
    private JTextField inputTextField = new JTextField("");
    
    // Initializing Button Group for Radio Buttons
    private ButtonGroup radioButtons = new ButtonGroup();
    
    // Initializing JOptionPane for Messages
    private static JOptionPane frame = new JOptionPane();

    // The two required objects for the checking and savings accounts
    private static Account checkingAcct = new Account().new Checking();
    private static Account savingsAcct = new Account().new Savings();
    
    // Formats numbers in dollar amounts
    private static DecimalFormat decimalFormat = new DecimalFormat("$0.00");
    
    // Constructor for ATM GUI
    public ATM (double checkingInitialBalance, double savingsInitialBalance) {

    	// GUI Parameters
        setTitle("ATM Machine");
        setLayout(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();
        layout.gridy = 2;
        setFrame(350, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creation of Separate Panels for Buttons and Text Field
        JPanel buttonPanel = new JPanel();
        JPanel textFieldPanel = new JPanel();
        
        // Panel Dimensions
        add(buttonPanel);
        add(textFieldPanel, layout);
        buttonPanel.setLayout(new GridLayout(3, 2, 10, 10));
        textFieldPanel.setLayout(new GridLayout(1, 1));
        
        // Adds Buttons, RadioButtons and Text Fields to ATM Panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        radioButtons.add(checking);
        radioButtons.add(savings);
        buttonPanel.add(checking);
        buttonPanel.add(savings);
        inputTextField.setPreferredSize(new Dimension(250, 20));
        checking.setSelected(true); // checking account selected by default
        textFieldPanel.add(inputTextField);

        // Creates the checking and savings accounts
        makeAccounts(checkingInitialBalance, savingsInitialBalance);

        // Assigns Action Listeners to Buttons
        button1.addActionListener(new Withdrawal());
        button2.addActionListener(new Deposit());
        button3.addActionListener(new TransferTo());
        button4.addActionListener(new Balance());
    }
  

    // ACTION LISTENERS**
    
    // Action listener for Withdrawal
    class Withdrawal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Checks for positive number and if an increment of 20
                if (getTextFieldValue() > 0 && getTextFieldValue() % 20 == 0) {
                    // Checks radio selection
                    if (checking.isSelected()) {
                    	checkingAcct.withdraw(getTextFieldValue());
                        JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+" has successfuly been withdrawn from your checking account.");
                    } else if (savings.isSelected()) {
                    	savingsAcct.withdraw(getTextFieldValue());
                        JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+" has successfully been withdrawn from your savings account.");
                    }
                    clearTextField();
                } else if (getTextFieldValue() % 20 != 0) {
                	errorNotIncrement20();
                }
                else errorInvalidAmount();
                	clearTextField();
            } catch (InsufficientFunds insufficientFunds) {
            	clearTextField();
            }
        }
    }

    // Action listener for Deposit
    class Deposit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Checks for positive number
            if (getTextFieldValue() > 0) {
                // Checks for radio selection
                if (checking.isSelected()) {
                	checkingAcct.deposit(getTextFieldValue());
                    JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+" has successfully been deposited into you checking account.");
                } else if (savings.isSelected()) {
                	savingsAcct.deposit(getTextFieldValue());
                    JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+" has successfully been deposited into you savings account.");
                }
                clearTextField();
            } else errorInvalidAmount();
            	clearTextField();
        }
    }

    // Action listener for Transfer To
    class TransferTo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // First checks for positive number
                if (getTextFieldValue() > 0) {
                    // Then checks for radio selection
                    if (checking.isSelected()) {
                        // Separate methods for transferFrom and transferTo
                    	savingsAcct.transferFrom(getTextFieldValue());
                        checkingAcct.transferTo(getTextFieldValue());
                        JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+" has successfully been transferred from your savings to your checking account.");
                    } else if (savings.isSelected()) {
                    	checkingAcct.transferFrom(getTextFieldValue());
                    	savingsAcct.transferTo(getTextFieldValue());
                        JOptionPane.showMessageDialog(frame, decimalFormat.format(getTextFieldValue())+"has successfully been transferred from your checking to your savings account.");
                    }
                    clearTextField();
                } else errorInvalidAmount();
                	clearTextField();
            } catch (InsufficientFunds insufficientFunds) {
            	clearTextField();
            }
        }
    }

    // Action listener for Balance
    class Balance implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Only checks for radio selection
            if (checking.isSelected()) {
                JOptionPane.showMessageDialog(frame,
                        "Balance for you checking account: \n" +decimalFormat.format(checkingAcct.getBalance()));
            } else if (savings.isSelected()) {
                JOptionPane.showMessageDialog(frame,
                        "Balance for you savings account: \n" +decimalFormat.format(savingsAcct.getBalance()));
            } else errorInvalidAmount();
            	clearTextField();
        }
    }

    // METHODS**
    
    // Method creates a Checking and Savings account based on starting values
    public static void makeAccounts(double checkingAccountStartBalance, double savingsAccountStartBalance) {
    	checkingAcct.setBalance(checkingAccountStartBalance);
    	savingsAcct.setBalance(savingsAccountStartBalance);
    }
    
    // This method returns the text in the text entry field as a double
    public double getTextFieldValue() {
        try {
            return Double.parseDouble(inputTextField.getText());
        } catch (NumberFormatException e) {
            clearTextField();
            return 0;
        }
    }
    
    // Error occurs when blanks, letters, and negative numbers are entered
    public void errorInvalidAmount() {
        JOptionPane.showMessageDialog(frame, "Please enter a valid amount.");
    }
    
    // Error occurs when trying to withdraw amount that isn't an increment of 20
    public void errorNotIncrement20() {
    	JOptionPane.showMessageDialog(frame, "Desired amount to be withrdrawn must be in increments of $20.");
    }

    // Methods that returns Service Fee
    public static void serviceFee() {
    	JOptionPane.showMessageDialog(frame, "You have already made 4 withdrawals from this account. "
    			+ "To continue making withdrawals, a service fee of $1.50 will be deducted from the account.");
    }
    
    // Method clears data in text field
    public void clearTextField() {
    	inputTextField.setText("");
    }

    // Method Determines Dimensions of Frame
    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Allows ATM to be Displayed
    public void display() {
        setVisible(true);
    }

    // Sets the starting balances of the accounts
    public static void main(String[] args) {
        ATM frame = new ATM(5000, 10000);
        frame.display();
    }

}