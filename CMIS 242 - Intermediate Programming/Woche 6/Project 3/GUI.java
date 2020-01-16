/*
 * Course:  	CMIS 242
 * File: 	GUI.java
 * Author: 	Andrew H. Rohn
 * Date: 	30 September 2018
 * Purpose: 	Contains the Main Method, GUI, and Event Handlers.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.*;

public class GUI extends javax.swing.JDialog implements ActionListener{
    
	// Frame Initialization
    private final JFrame frame = new JFrame();
    
    // RadioButton Initialization
    private final JRadioButton recursiveButton = new JRadioButton("Recursive");
    private final JRadioButton iterativeButton = new JRadioButton("Iterative");
    private final JButton computeButton = new JButton("Compute");
    
    // TextField Initialization
    private final JTextField inputTextField = new JTextField();
    private final JTextField resultTextField = new JTextField();
    private final JTextField efficiencyTextField = new JTextField();
    
  
    // Default Constructor for GUI
    public GUI() {
     
    	// Frame Dimensions
    	frame.setTitle("Project 3");
        frame.setBackground(Color.lightGray);
        frame.setSize(300,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Frame Layout 
        frame.setLayout(new GridLayout(6,2,3,10));
        frame.add(new JLabel(""));
        frame.add(iterativeButton);
        frame.add(new JLabel(""));
        frame.add(recursiveButton);
        frame.add(new JLabel("Enter n:"));
        frame.add(inputTextField);
        frame.add(new JLabel(""));
        frame.add(computeButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultTextField);
        frame.add(new JLabel("Efficiency:"));
        frame.add(efficiencyTextField);
        frame.addWindowListener(new WindowAdapterImpl()); 
        
        // Method Type RadioButtonGroup
        ButtonGroup methodType = new ButtonGroup();
        methodType.add(recursiveButton);
        methodType.add(iterativeButton);
        iterativeButton.setSelected(true);
        
        // ActionListeners for Buttons
        iterativeButton.setActionCommand("iterative");
        recursiveButton.setActionCommand("recursive");
        computeButton.setActionCommand("compute");
        iterativeButton.addActionListener(GUI.this);
        recursiveButton.addActionListener(GUI.this);
        computeButton.addActionListener(GUI.this);
    }
  
    // Method Rejects Invalid Inputs
    public boolean validInput(String n) {
         	try {
               int input = Integer.parseInt(n);
               if (input < 0) {
            	   JOptionPane.showMessageDialog(frame, "Please enter a postive integer.");
            	   clearText();
            	   return false;
               }
            }
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
               clearText();
               return false;
             }
            return true;
        }
    
    // Event Handler for Compute Button
    public void actionPerformed(ActionEvent e) {
         String event = e.getActionCommand();
         String input;
         String result;
         switch (event) {
             case "compute":
                 input = inputTextField.getText();
                 if (validInput(input) == false)
                	 break;
               
                 if (iterativeButton.isSelected()) {
                     result = ""+Sequence.computeIterative(Integer.parseInt(input));
                 }
                 else if (recursiveButton.isSelected()) {
                     result = ""+Sequence.computeRecursive(Integer.parseInt(input));
                 }
                 else {
                     result = "";
                 }
                 // Output
                 resultTextField.setText(result);
                 efficiencyTextField.setText(""+Sequence.getEfficiency()); // Calls getEfficiency Method
                 break;
         }
    }
    
    // Event Handler for Efficiency Values.csv File Creation
    private static class WindowAdapterImpl extends WindowAdapter {
        public WindowAdapterImpl() {
        }
        public void windowClosing(WindowEvent e) {
            try {
                int iterativeEfficiency, recursiveEfficiency;
                FileWriter file = new FileWriter("Efficiency Values.csv");
                for(int n = 0; n <= 10; n++) {
                    Sequence.computeIterative(n);
                    iterativeEfficiency = Sequence.getEfficiency(); // Gets Iterative Efficiency Values
                    Sequence.computeRecursive(n);
                    recursiveEfficiency = Sequence.getEfficiency(); // Gets Recursive Efficiency Values
                    file.write(n+","+iterativeEfficiency+","+recursiveEfficiency+"\n"); // 
                }
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    // Method Resets TextField
    public void clearText() {
    	inputTextField.setText(""); 
    }

    // Main Method
    public static void main(String[] args) {
        GUI guiObject = new GUI();
    } 
}
